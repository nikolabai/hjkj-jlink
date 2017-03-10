package hjkj.service;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * 创建接收流和数据分发线程
 * @author YUB
 *
 */
public class ReceiveThread extends Thread{
	
	private Socket socket;
	private ObjectInputStream iStream;
	private ObjectOutputStream oStream;

	public ReceiveThread(Socket socket) {
		this.socket = socket;
		
		try {
			iStream = new ObjectInputStream(this.socket.getInputStream());
			oStream = new ObjectOutputStream(this.socket.getOutputStream());
			
			start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
//		new ReveiveDispather(iStream,oStream).DataHandle();
	}

}
