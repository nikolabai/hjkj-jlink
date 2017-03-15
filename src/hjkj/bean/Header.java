package hjkj.bean;

import hjkj.util.DataManage;

/**
 * Created by YUB on 17/3/15.
 * 协议头
 */
public class Header {

    //协议版本号
    private byte[] verFlag = new byte[2];
    //目的地址 （J链FF）
    private byte dest;
    //源地址
    private byte src;
    //优先级
    private byte priority;
    //生存周期
    public byte lifeTime;
    //命令类型
    public short cmd;
    //数据长度
    public short length;
    //端机类型（2bit)、链路类型(2bit)、IP映射数（4bit)
    public byte type;
    //预留位
    public byte obligate;

    //转化为数组
    public byte[] getBytes() {
        byte[] bytes = new byte[12];
        int index = 0;
        bytes[index++] = verFlag[0];
        bytes[index++] = verFlag[1];
        bytes[index++] = dest;
        bytes[index++] = src;
        bytes[index++] = priority;
        bytes[index++] = lifeTime;
        System.arraycopy(DataManage.shortToBytes(cmd), 0, bytes, index, 2);
        index += 2;
        System.arraycopy(DataManage.shortToBytes(length), 0, bytes, index, 2);
        index += 2;
        bytes[index++] = type;
        bytes[index++] = obligate;

        return bytes;
    }

    public byte[] getVerFlag() {
        return verFlag;
    }

    public void setVerFlag(byte[] verFlag) {
        this.verFlag = verFlag;
    }

    public byte getDest() {
        return dest;
    }

    public void setDest(byte dest) {
        this.dest = dest;
    }

    public byte getSrc() {
        return src;
    }

    public void setSrc(byte src) {
        this.src = src;
    }

    public byte getPriority() {
        return priority;
    }

    public void setPriority(byte priority) {
        this.priority = priority;
    }

    public byte getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(byte lifeTime) {
        this.lifeTime = lifeTime;
    }

    public short getCmd() {
        return cmd;
    }

    public void setCmd(short cmd) {
        this.cmd = cmd;
    }

    public short getLength() {
        return length;
    }

    public void setLength(short length) {
        this.length = length;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public byte getObligate() {
        return obligate;
    }

    public void setObligate(byte obligate) {
        this.obligate = obligate;
    }
}
