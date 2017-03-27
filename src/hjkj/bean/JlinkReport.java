package hjkj.bean;

/**
 * Created by Gavin on 2017/3/20.
 * J链的上报信息
 */
public class JlinkReport {
    //最大的错包数告警
    private byte MaxErrorPkg;

    //转化为数组
    public byte[] getBytes() {
        byte[] bytes = new byte[1];
        bytes[0] = MaxErrorPkg;
        return bytes;
    }

    public byte getMaxErrorPkg() {
        return MaxErrorPkg;
    }

    public void setMaxErrorPkg(byte maxErrorPkg) {
        MaxErrorPkg = maxErrorPkg;
    }
}
