import cn.usr.UsrCloudMqttClientAdapter;
import cn.usr.client.UsrCloudMqttCallback;
import org.eclipse.paho.client.mqttv3.MqttException;

/**
 * @Package: cn.usr.demo
 * @Description: TODO
 * @author: Rock 【shizhiyuan@usr.cn】
 * @Date: 2018-03-29 12:09
 */
public class UsrCloudClientDemo extends UsrCloudMqttClientAdapter {


    @Override
    public void Connect(String userName, String passWord) throws MqttException {
        super.Connect(userName, passWord);
    }

    @Override
    public void setUsrCloudMqttCallback(UsrCloudMqttCallback CloudMqttCallback) {
        super.setUsrCloudMqttCallback(CloudMqttCallback);
    }

    @Override
    public void publishParsedSetDataPoint(String devId, String slaveIndex, String pointId, String value) throws MqttException {
        super.publishParsedSetDataPoint(devId, slaveIndex, pointId, value);
    }

    @Override
    public void publishParsedQueryDataPoint(String devId, String slaveIndex, String pointId) throws MqttException {
        super.publishParsedQueryDataPoint(devId, slaveIndex, pointId);
    }

    @Override
    public void SubscribeParsedByDevId(String devId) throws MqttException {
        super.SubscribeParsedByDevId(devId);
    }

    @Override
    public void publishForDevId(String devId, byte[] data) throws MqttException {
        super.publishForDevId(devId, data);
    }
}
