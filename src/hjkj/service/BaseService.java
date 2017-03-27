package hjkj.service;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class BaseService {

	protected DatagramSocket socket;

	protected InetAddress address;
	protected int port;

	//发送时数据,数组定义在相关的具体使用的service中
	protected DatagramPacket sendPacket;
	protected byte[] sendData;

	//接收服务器返回数据
	protected DatagramPacket receivePacket;
	protected byte[] receiveData;


	// 空构造函数，在子类ReceiveService中使用
	public BaseService(){

	}
	// 传递创建socket值的构造函数
	public BaseService(InetAddress address, int port) {
		this.address = address;
		this.port = port;
	}

	public boolean createSocket() {

		try {
			if (socket == null) {
				socket = new DatagramSocket();
			}
			return true;
		} catch (Exception e) {
			System.out.println("连接服务器失败，请确认服务器正常");
			return false;
		}

	}

}
