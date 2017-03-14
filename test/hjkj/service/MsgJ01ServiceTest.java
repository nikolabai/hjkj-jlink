package hjkj.service;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * Created by YUB on 17/3/13.
 */
public class MsgJ01ServiceTest extends BaseService implements Runnable{

    private int code;

    //测试用
    private byte[] buffer = new byte[10];


    //执行父类的构造函数，传递ip与端口值
    public MsgJ01ServiceTest(InetAddress address, int port) {
        super(address, port);
    }

    @Override
    public void run() {
//        if(createSocket()){
//
//            //封装登录时要发送的数据
////            ClientCode.setCode(ClientCode.FILM_REQUEST);
////            String codeString = ClientCode.getCode() + "";
//
//            for(int i = 0 ;i < 10; i++){
//                buffer[i] = (byte)(i + 1);
//            }
//            //发送数据
//            try {
//                sendPacket=new DatagramPacket(buffer, buffer.length, address, 8088);
//                socket.send(sendPacket);
////                System.out.println("发送数据：" + new String(sendPacket.getData(), 0, receivePacket.getLength()));
//
//            } catch (IOException e) {
//                System.out.println("发送数据失败");
//                e.printStackTrace();
//            }
//
//            //接收服务器反馈
//            try {
//                receiveData = new byte[10];
//                receivePacket = new DatagramPacket(receiveData, receiveData.length);
//                socket.receive(receivePacket);
//                System.out.println("收到反馈数据：" + Arrays.toString(receiveData));
//            } catch (IOException e) {
//                System.out.println("接收数据失败");
//                e.printStackTrace();
//            }
//    }
    }


    public static void main(String[] args) throws UnknownHostException {

        MsgJ01ServiceTest msgJ01Service = new MsgJ01ServiceTest(InetAddress.getByName("localhost"),8088);

        Thread thread = new Thread(msgJ01Service);
        thread.start();

    }

}
