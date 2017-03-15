package hjkj.bean;

import hjkj.util.DataManage;

/**
 * Created by YUB on 17/3/15.
 * 转发指挥表
 */
public class DirectTable {

    //            转发源ID航迹号
    private byte src;
    //            源链路类型
    private byte srcLinkType;

    //            消息类型
    private short msgType;

    //            目的航迹号
    private byte dest;
    //            目的链路类型
    private byte destLinkType;

    //转化为数组
    public byte[] getBytes() {
        byte[] bytes = new byte[6];
        int index = 0;

        bytes[index++] = src;
        bytes[index++] = srcLinkType;
        System.arraycopy(DataManage.shortToBytes(msgType), 0, bytes, index, 2);
        index += 2;

        bytes[index++] = dest;
        bytes[index++] = destLinkType;

        return bytes;
    }


    public byte getSrc() {
        return src;
    }

    public void setSrc(byte src) {
        this.src = src;
    }

    public byte getSrcLinkType() {
        return srcLinkType;
    }

    public void setSrcLinkType(byte srcLinkType) {
        this.srcLinkType = srcLinkType;
    }

    public short getMsgType() {
        return msgType;
    }

    public void setMsgType(short msgType) {
        this.msgType = msgType;
    }

    public byte getDest() {
        return dest;
    }

    public void setDest(byte dest) {
        this.dest = dest;
    }

    public byte getDestLinkType() {
        return destLinkType;
    }

    public void setDestLinkType(byte destLinkType) {
        this.destLinkType = destLinkType;
    }
}
