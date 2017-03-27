package hjkj.bean;

/**
 * Created by YUB on 17/3/15.
 * IP映射
 */
public class IPMappedWrapper {

    //端机号 链路类型 预留
    private byte unit;

    //ip号
    private byte ipNumber;

    //源航迹号或源地址ID
    private byte sourceAddress;

    //转化为数组
    public byte[] getBytes() {
        byte[] bytes = new byte[3];
        int index = 0;
        bytes[index++] = unit;
        bytes[index++] = ipNumber;
        bytes[index++] = sourceAddress;
        return bytes;
    }

    public byte getUnit() {
        return unit;
    }

    public void setUnit(byte unit) {
        this.unit = unit;
    }

    public byte getIpNumber() {
        return ipNumber;
    }

    public void setIpNumber(byte ipNumber) {
        this.ipNumber = ipNumber;
    }

    public byte getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(byte sourceAddress) {
        this.sourceAddress = sourceAddress;
    }
}
