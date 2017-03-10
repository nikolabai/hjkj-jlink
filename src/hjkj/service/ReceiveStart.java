package hjkj.service;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 开始接收
 * @author YUB
 *
 */
public class ReceiveStart{

	private Socket socket;
	private ServerSocket serverSocket;
	
	public ReceiveStart(int port) {
		try {
			
			serverSocket = new ServerSocket(port);
			System.out.println("打开接收端口" + port);
			
			while(true){
				socket = serverSocket.accept();

				System.out.println("开始接收");
				new ReceiveThread(socket);
			} 
			
		} catch (IOException e) {
			System.out.println("接收出错，请查看");
		}
		
	}
	
	public static void main(String[] args) {
		new ReceiveStart(8888);
	}

}
