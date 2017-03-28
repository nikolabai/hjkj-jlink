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
    private byte lifeTime;
    //命令类型
    private short cmd;
    //数据长度
    private short length;
    //端机类型（2bit)、链路类型(2bit)、IP映射数（4bit)
    private byte type;


    //IP映射数
    private byte iPNumber;
//    //数据（负载）
//    private byte[] payLoad;
    //数据校验，校验所有数据（包含头部和负载）
//    private byte CRC;
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
        bytes[index++] = iPNumber;

        return bytes;
    }

    public Header setJHeader(short code, short length, byte type, byte ipNumber){
        Header header = new Header();
        //协议版本号写死
        byte[] verFlag = {0, 1};
        header.setVerFlag(verFlag);
        header.setDest((byte)125);
        //j链的源航迹号写死
        header.setSrc((byte)1);
        header.setPriority((byte)1);
        header.setLifeTime((byte)0);
        //j链的cmd和长度可变
        header.setCmd(code);
        header.setLength(length);
        //type待修改
        header.setType(type);
        header.setIPNumber(ipNumber);
        return header;
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

    public byte getType(byte type){
        return type;
    }

    public byte getType(String nodeType, String linkType) {

        //为端机类型和链路类型赋值
        byte node,link,type = 0;
        node = getNodeLinkType(nodeType);
        link = getNodeLinkType(linkType);
        type |= node;
        type <<= 2;
        type |= link;
        type <<= 4;

        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public byte getIPNumber() {
        return iPNumber;
    }

    public void setIPNumber(byte iPNumber) {
        this.iPNumber = iPNumber;
    }


    private byte getNodeLinkType(String typeString){
        byte type;
        switch (typeString){
            case "T":
                type = 0;
                break;
            case "J":
                type = 1;
                break;
            case "X":
                type = 2;
                break;
            default:
                type = 2;
                break;
        }
        return type;
    }


}
