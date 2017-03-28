package hjkj.service;

import hjkj.bean.Header;
import hjkj.util.CRC8;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

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

	protected Header header;
	protected byte[] headerArray;
	// 空构造函数，在子类ReceiveService中使用
//	public BaseService(){
//
//	}
	// 传递创建socket值的构造函数
//	public BaseService(InetAddress address, int port) {
	public BaseService() {
		try {
			this.address = InetAddress.getLocalHost();
			this.port = 8080;
		} catch (UnknownHostException e) {
			System.out.println("ip地址和端口号传入失败，请检查");
			e.printStackTrace();
		}
	}

	protected boolean createSocket() {

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

	//公用方法，计算CRC8，拼接header和payload，CRC校验码
	protected byte[] getSendData(Header header, byte[] payLoad){
		byte[] headerData = header.getBytes();
		//发送的数据长度为header和payload，CRC校验码三者长度之和
		byte[] sendData = new byte[headerData.length + payLoad.length + 1];
		System.arraycopy(headerData, 0, sendData, 0, headerData.length);
		System.arraycopy(payLoad, 0, sendData, headerData.length, payLoad.length);

		//crc要校验的发送数据
		byte[] crcData = Arrays.copyOfRange(sendData, 0, sendData.length - 1);
		byte crc = CRC8.CRC(crcData);
		sendData[sendData.length - 1] = crc;
		return sendData;
	}

}
