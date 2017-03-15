package hjkj.bean;

import hjkj.util.DataManage;

/**
 * Created by YUB on 17/3/10.
 */
public class SlotPlan {

    //即时消息类型
    private byte dataType;

    //本包数据长度
    private byte dataLength;

    //即时消息数据
    private byte[] data = new byte[1000];

    //转化为数组
    public byte[] getBytes() {
        byte[] bytes = new byte[1002];
        int index = 0;
        bytes[index++] = dataType;
        bytes[index++] = dataLength;
        System.arraycopy(data, 0, bytes, index, data.length);

        return bytes;
    }

    public byte getDataType() {
        return dataType;
    }

    public void setDataType(byte dataType) {
        this.dataType = dataType;
    }

    public byte getDataLength() {
        return dataLength;
    }

    public void setDataLength(byte dataLength) {
        this.dataLength = dataLength;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
