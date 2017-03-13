package hjkj.server;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by YUB on 17/3/13.
 */

public class Server extends Thread
{
    DatagramSocket socket = null;
    DatagramPacket receivePacket = null;
    DatagramPacket sendPacket = null;


    public static void main(String[] args) throws Exception
    {
        new Server().start();
    }

    public void run()
    {
        try
        {
            socket = new DatagramSocket(8000);
        }
        catch (SocketException e1)
        {
            e1.printStackTrace();
        }

        while(true)
        {
            try
            {
                //接收
                byte[] buf = new byte[35100];
                receivePacket = new DatagramPacket(buf,buf.length);
                socket.receive(receivePacket);

                //发送
                int dataLength = receivePacket.getLength();
                byte[] dataBuf = new byte[dataLength];
                System.arraycopy(buf, 0, dataBuf, 0, dataLength);

                transmit(dataBuf);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }


    public void transmit(byte[] data) throws Exception
    {
        //原路转发回去
        sendPacket = new DatagramPacket(data,data.length,receivePacket.getAddress(),receivePacket.getPort());
        socket.send(sendPacket);
    }
}

