package hjkj.bean;

/**
 * Created by YUB on 17/3/10.
 * J0.1消息
 */
public class MsgJ01 {
    //J消息包头
    private byte[] JMsgHead=new byte[35];
    //业务消息类型
    private byte dataType;
    //包序号
    private byte[] frameNum = new byte[4];
    //包总数
    private byte[] frameTotal = new byte[4];
    //本包数据长度
    private byte[] dataLen = new byte[2];
    //目的航迹号
    private byte[] destTrackNumber = new byte[2];
    //即时消息数据
    private byte[] data= new byte[963];

    //转化为数组
    public byte[] getBytes() {
        byte[] bytes = new byte[1011];
        int index = 0;
        System.arraycopy(JMsgHead,0,bytes,0,35);
        index += 35;
        bytes[index++] = dataType;
        System.arraycopy(frameNum,0,bytes,36,4);
        index += 4;
        System.arraycopy(frameTotal,0,bytes,40,4);
        index += 4;
        System.arraycopy(dataLen,0,bytes,44,2);
        index += 2;
        System.arraycopy(destTrackNumber,0,bytes,46,2);
        index += 2;
        System.arraycopy(data,0,bytes,40,963);


        return bytes;
    }

    public byte[] getJMsgHead() {
        return JMsgHead;
    }

    public void setJMsgHead(byte[] JMsgHead) {
        this.JMsgHead = JMsgHead;
    }

    public byte getDataType() {
        return dataType;
    }

    public void setDataType(byte dataType) {
        this.dataType = dataType;
    }

    public byte[] getFrameNum() {
        return frameNum;
    }

    public void setFrameNum(byte[] frameNum) {
        this.frameNum = frameNum;
    }

    public byte[] getFrameTotal() {
        return frameTotal;
    }

    public void setFrameTotal(byte[] frameTotal) {
        this.frameTotal = frameTotal;
    }

    public byte[] getDataLen() {
        return dataLen;
    }

    public void setDataLen(byte[] dataLen) {
        this.dataLen = dataLen;
    }

    public byte[] getDestTrackNumber() {
        return destTrackNumber;
    }

    public void setDestTrackNumber(byte[] destTrackNumber) {
        this.destTrackNumber = destTrackNumber;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
