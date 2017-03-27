package hjkj.bean;

/**
 * Created by Gavin on 2017/3/20.
 * J业务消息
 */
public class MsgBussiness {
    //业务消息类型
    private byte dataType;
    //本包数据长度
    private byte[] dataLen = new byte[2];
    //即时消息数据
    private byte[] data = new byte[1008];

    //转化为数组
    public byte[] getBytes() {
        byte[] bytes = new byte[1011];
        int index = 0;
        bytes[index++] = dataType;
        System.arraycopy(dataLen,0,bytes,1,2);
        index += 2;
        System.arraycopy(data,0,bytes,3,1008);

        return bytes;
    }

    public byte getDataType() {
        return dataType;
    }

    public void setDataType(byte dataType) {
        this.dataType = dataType;
    }

    public byte[] getDataLen() {
        return dataLen;
    }

    public void setDataLen(byte[] dataLen) {
        this.dataLen = dataLen;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
