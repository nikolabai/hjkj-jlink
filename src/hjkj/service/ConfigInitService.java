package hjkj.service;

import hjkj.bean.ConfigInit;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ConfigInitService extends BaseService implements Runnable {

	private ConfigInit configInit;

	public ConfigInitService(ConfigInit configInit) throws UnknownHostException {
		super(InetAddress.getLocalHost(),8080);
		this.configInit = configInit;
	}

	@Override
	public void run() {
		if(createSocket())
		sendData = configInit.getBytes();
		sendPacket = new DatagramPacket(sendData, sendData.length, address, port);
		System.out.println("发送的地址是：" + address + ",端口号是：" + port);
	}

}
