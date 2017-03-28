package hjkj.bean;

/**
 * Created by YUB on 17/3/28.
 */
public class MsgJ01Header {
    //时隙类型
    private static byte slotType;
    //中继指示
    private static byte riTm;
    //源航迹号
    private static short src;
    //保密数据单元 默认为0
    private static short sdu;

    //转化为数组,暂且都写死
    public static byte[] getBytes() {
        byte[] bytes = new byte[5];
        slotType = 4;
        riTm = 0;
        src = 1;
        sdu = 0;
        bytes[0] = slotType;
        bytes[1] = 0;
        bytes[2] = (byte)src;
        bytes[3] = 0;
        bytes[4] = (byte)sdu;
        return bytes;
    }

    public byte getSlotType() {
        return slotType;
    }

    public void setSlotType(byte slotType) {
        this.slotType = slotType;
    }

    public byte getRiTm() {
        return riTm;
    }

    public void setRiTm(byte riTm) {
        this.riTm = riTm;
    }

    public short getSrc() {
        return src;
    }

    public void setSrc(short src) {
        this.src = src;
    }

    public short getSdu() {
        return sdu;
    }

    public void setSdu(short sdu) {
        this.sdu = sdu;
    }
}
