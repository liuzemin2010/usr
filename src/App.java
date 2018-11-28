import org.eclipse.paho.client.mqttv3.MqttException;

/**
 * @Package: cn.usr.demo
 * @Description: TODO
 * @author: Rock 【shizhiyuan@usr.cn】
 * @Date: 2018-03-29 12:20
 */
public class App implements CallbackTest {


    static UsrCloudClientDemo client = null;

    public static void main(String[] args) {

        client = new UsrCloudClientDemo();
        UsrCloudCallbackDemo callback = new UsrCloudCallbackDemo();

        try {
            client.setUsrCloudMqttCallback(callback);

            client.Connect("feiaoda", "123456");

            Thread.sleep(3000);

//            // 订阅云交换机和云组态
//            client.SubscribeParsedByDevId("00004299015953132138");
//            client.SubscribeForUsername();


        } catch (MqttException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void ConectBack() {

        try {
//            client.SubscribeParsedByDevId("00016349000000000001");
            client.publishParsedSetDataPoint("00016349000000000001","2","31781","0");

        } catch (MqttException e) {
            e.printStackTrace();
        }


    }
}
