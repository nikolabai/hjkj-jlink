package hjkj.service;


import hjkj.bean.ConfigInit;
import hjkj.bean.Header;
import hjkj.bean.MsgJ01;
import hjkj.data.CMDCode;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * Created by YUB on 17/3/13.
 */
public class MsgJ01Service extends BaseService implements Runnable{

    private int code;
    private MsgJ01 msgJ01;
    private byte[] j01Array;

    public MsgJ01Service(MsgJ01 msgJ01) throws UnknownHostException {
        super();
        this.msgJ01 = msgJ01;
    }

    @Override
    public void run() {
        if(createSocket()){
            header = new Header();
//            header.setJHeader(CMDCode.MSG_J, msgJ01.getLength(), header.getType("X","J"), (byte)0);
//            sendData = getSendData(header, configInit.getBytes());
            System.out.println("发送数据：" + Arrays.toString(sendData) + "数据长度：" + sendData.length);
            sendPacket = new DatagramPacket(sendData, sendData.length, address, port);
            System.out.println("发送的地址是：" + address + ",端口号是：" + port);
        }
    }

}
