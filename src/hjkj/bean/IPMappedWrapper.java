package hjkj.bean;

/**
 * Created by YUB on 17/3/15.
 * IP映射
 */
public class IPMappedWrapper {

    //端机号 未完成
    private byte info;

    //链路类型

    //ip号

    //源航迹号或源地址ID
    private byte src;

    public byte getInfo() {
        return info;
    }

    public void setInfo(byte info) {
        this.info = info;
    }

    public byte getSrc() {
        return src;
    }

    public void setSrc(byte src) {
        this.src = src;
    }
}
