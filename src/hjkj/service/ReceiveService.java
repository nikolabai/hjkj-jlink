package hjkj.service;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 开始接收
 * @author YUB
 *
 */
public class ReceiveService extends BaseService{

//	private Socket socket;
//	private ServerSocket serverSocket;

//	public ReceiveService(int port) {
//		try {
//
//			serverSocket = new ServerSocket(port);
//			System.out.println("打开接收端口" + port);
//
//			while(true){
//				socket = serverSocket.accept();
//
//				System.out.println("开始接收");
//				new ReceiveThread(socket);
//			}
//
//		} catch (IOException e) {
//			System.out.println("接收出错，请查看");
//		}


		
//	}
//	DataDispath dataDispath;
//	int cmdType;



	//构造函数
	public ReceiveService(DatagramSocket socket)
	{
		this.socket = socket;
	}

	//接收线程执行
	public void run()
	{
		while(true)
		{
			receiveData = new byte[1024];
			try
			{
				receivePacket = new DatagramPacket(receiveData,receiveData.length);
				socket.receive(receivePacket);

				/*
				先CRC校验，校验通过的进入下一步，视频信息不通过校验
				cmdType = Util.bytesToShort(receiveData[6], receiveData[7]);
				if(2 != cmdType)
				{
				int dataLength = recPacket.getLength();
				byte[] dataBuf = new byte[dataLength-1];
				System.arraycopy(receiveData, 0, dataBuf, 0, dataLength-1);
				if(receiveData[dataLength-1] != CRC8.CRC(dataBuf))
				{
				System.out.println("CRC校验错误");
				continue;
				}
				}
				*/

				new ReceiveDispather(receiveData);
			}
			catch (Exception e)
			{
				System.out.println("接收数据失败，在ReceiveService中");
				e.printStackTrace();

			}
		}
	}
//	public static void main(String[] args) {
//		new ReceiveService(8888);
//	}

}
