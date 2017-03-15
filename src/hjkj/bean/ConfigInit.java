package hjkj.bean;


/**
 * Created by YUB on 17/3/15.
 * 初始化配置
 */
public class ConfigInit {
    // X端机J链的ID
    private byte XJId;
    // X端机T链的ID
    private byte XTId;
    // X端机IP
    private byte ip;
    // 是否为时间基准
    private byte isNTR;

    //转化为数组
    public byte[] getBytes() {
        byte[] bytes = new byte[4];
        int index = 0;
        bytes[index++] = XJId;
        bytes[index++] = XTId;
        bytes[index++] = ip;
        bytes[index++] = isNTR;

        return bytes;
    }

    public ConfigInit(byte XJId, byte XTId, byte ip, byte isNTR) {
        this.XJId = XJId;
        this.XTId = XTId;
        this.ip = ip;
        this.isNTR = isNTR;
    }

    public byte getXJId() {
        return XJId;
    }

    public void setXJId(byte XJId) {
        this.XJId = XJId;
    }

    public byte getXTId() {
        return XTId;
    }

    public void setXTId(byte XTId) {
        this.XTId = XTId;
    }

    public byte getIp() {
        return ip;
    }

    public void setIp(byte ip) {
        this.ip = ip;
    }

    public byte getIsNTR() {
        return isNTR;
    }

    public void setIsNTR(byte isNTR) {
        this.isNTR = isNTR;
    }
}
