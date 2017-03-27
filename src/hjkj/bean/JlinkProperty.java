package hjkj.bean;

/**
 * Created by Gain on 2017/3/20.
 * J链的当前节点性能信息查询应答
 */
public class JlinkProperty {
    //当前节点号
    private byte nodeNumBer;
    //当前节点的收包数
    private byte rxPkg;
    //当前节点的发包数
    private byte txPkg;
    //当前节点收到的错包数
    private byte errorPkg;
    //时间戳
    private byte[] alarmaTime = new byte[6];

    //转化为数组
    public byte[] getBytes() {
        byte[] bytes = new byte[10];
        int index = 0;
        bytes[index++] = nodeNumBer;
        bytes[index++] = rxPkg;
        bytes[index++] = txPkg;
        bytes[index++] = errorPkg;
        System.arraycopy(alarmaTime,0,bytes,4,6);
        return bytes;
    }

    public byte getNodeNumBer() {
        return nodeNumBer;
    }

    public void setNodeNumBer(byte nodeNumBer) {
        this.nodeNumBer = nodeNumBer;
    }

    public byte getRxPkg() {
        return rxPkg;
    }

    public void setRxPkg(byte rxPkg) {
        this.rxPkg = rxPkg;
    }

    public byte getTxPkg() {
        return txPkg;
    }

    public void setTxPkg(byte txPkg) {
        this.txPkg = txPkg;
    }

    public byte getErrorPkg() {
        return errorPkg;
    }

    public void setErrorPkg(byte errorPkg) {
        this.errorPkg = errorPkg;
    }

    public byte[] getAlarmaTime() {
        return alarmaTime;
    }

    public void setAlarmaTime(byte[] alarmaTime) {
        this.alarmaTime = alarmaTime;
    }
}
