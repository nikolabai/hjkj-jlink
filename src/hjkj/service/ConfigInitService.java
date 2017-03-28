package hjkj.service;

import hjkj.bean.ConfigInit;
import hjkj.bean.Header;
import hjkj.data.CMDCode;

import java.net.DatagramPacket;
import java.net.UnknownHostException;
import java.util.Arrays;

public class ConfigInitService extends BaseService implements Runnable {

	private ConfigInit configInit;
	private byte[] initArray;

	public ConfigInitService(ConfigInit configInit) throws UnknownHostException {
		super();
		this.configInit = configInit;
	}

	@Override
	public void run() {
		if(createSocket()){
			header = new Header();
			header.setJHeader(CMDCode.CONFIG_JINIT, configInit.getLength(), header.getType("X","J"), (byte)0);
			sendData = getSendData(header, configInit.getBytes());
			System.out.println("发送数据：" + Arrays.toString(sendData) + "数据长度：" + sendData.length);
			sendPacket = new DatagramPacket(sendData, sendData.length, address, port);
			System.out.println("发送的地址是：" + address + ",端口号是：" + port);
		}
	}

}
