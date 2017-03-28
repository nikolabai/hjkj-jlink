package hjkj.util;

import java.nio.ByteBuffer;



public class DataManage
{
	//小端
	public static byte[] shortToBytes(short s)
	{
		byte[] bytes = new byte[2];
		bytes[1] = (byte)((s >>>8) & 0xff);
		bytes[0] = (byte)(s & 0xff);
		return bytes;
	}
	
	
	public static short bytesToShort(byte byte0, byte byte1)
	{
		short result;
		result = (short) (byte1 & 0xff);
		result = (short) ((result << 8) | (byte0 & 0xff));
		return result;
	}
	
	//小端
	public static byte[] intToBytes(int i) 
	{  
		byte[] bytes = new byte[4];  
	    bytes[3] = (byte) ((i >>> 24) & 0xff);  
	    bytes[2] = (byte) ((i >>> 16) & 0xff);  
	    bytes[1] = (byte) ((i >>> 8) & 0xff);  
	    bytes[0] = (byte) (i & 0xff);  
		return bytes; 
	}
	
	
	//bytes转int
	public static int bytesToInt(byte[] bytes) 
	{  
        int addr=0;  
        addr = bytes[3] & 0xFF;  
        addr = (addr << 8) | (bytes[2] & 0xff) ;  
        addr = (addr << 8) | (bytes[1] & 0xff) ;  
        addr = (addr << 8) | (bytes[0] & 0xff) ;  
        return addr;
	}
	
	public static void main(String[] args)
	{
//		byte[] b = new byte[4];
//		b = intToBytes(67);
//		System.out.println(bytesToInt(b));
		
		System.out.println(188 ^ 140);
		System.out.println(((byte)188) ^ 140);
	}
	

	
	public static byte[] floatToBytes(float f)
	{
		byte[] data = new byte[4];
		int value = Float.floatToIntBits(f);
		data[0] = (byte)(value >> 24);
		data[1] = (byte)(value >> 16);
		data[2] = (byte)(value >> 8);
		data[3] = (byte)(value);
		return data;
	}
	
	public static float bytesToFloat(byte[] b)
	{
		int accum = 0;
		accum = accum|(b[3] & 0xff) << 0;
		accum = accum|(b[2] & 0xff) << 8;
		accum = accum|(b[1] & 0xff) << 16;
		accum = accum|(b[0] & 0xff) << 24;
		return Float.intBitsToFloat(accum);
	}
	
	//byte与long的互转
	
	
	
	//从源字节数据剪出4个字节组成新的byte数组
	public static byte[] cutTobytes (byte[] srcByte,int start)
	{
		byte[] temp = new byte[4];
		temp[0] = srcByte[start];
		temp[1] = srcByte[start+1];
		temp[2] = srcByte[start+2];
		temp[3] = srcByte[start+3];
		return temp;	
	}


	public static byte[] longToBytes(long x) {
		ByteBuffer buffer = ByteBuffer.allocate(8);
		buffer.putLong(0, x);
		return buffer.array();
	}

	//生成一个值全为0的byte数组
	public static byte[] resetArray(int length){
		return new byte[length];
	}

	
	
	
}
