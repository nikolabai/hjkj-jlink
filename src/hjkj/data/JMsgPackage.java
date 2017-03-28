package hjkj.data;

import java.util.Arrays;

public class JMsgPackage {
	
	private static int usSrcTrackNum ;
	private static int PakageType ;
	private static byte[] JMesg={1,1,1,1,1};
//			{1,5,4,5,4,4,4,4,4,4,4,4,8,8,8,8,8,8,8,8,8,8,8,8,1,5,4,5,4,4,4,4,4,4,4,4,8,8,8,8,8,8,8,8,8,8,8,8,1,5,4,5,4,4,4,4,4,4,4,4,8,8,8,8,8,8,8,8,8,8,8,8};   //��ѡȫ����Ϣ������

	public static void main(String[] args) {
		byte[] Jmsg = jMsgPkg.controlJMsg(1, 4, JMesg, 0);
		System.out.println(Arrays.toString(Jmsg));
	}
	
	public static JMsgPackage jMsgPkg = new JMsgPackage();
	public byte[] controlJMsg(int usSrcTrackNum,int PakageType,byte[] JMsg,int SDUnum){
/*		
		 this.usSrcTrackNum = usSrcTrackNum ;  
	     this.PakageType = PakageType ;
	     this.JMesg = JMesg ;*/
	     
	     /*STDP��װ*/
		 byte[] Jmessage = null;
	     if(PakageType == 4){
	        byte[] tmpSTDP = new byte[42] ;//�������ַ�װ��һ���byte���飬����Ϊ42
	 		for(int i=0 ; i<JMsg.length; i++){
	 		  tmpSTDP[i] = JMsg[i];
	 		}
	 		
	 		Jmessage = JMesgSTDP(tmpSTDP,usSrcTrackNum,PakageType,SDUnum) ;
	     }
	     /*P2SP����P2DP��װ*/
	     if(PakageType == 3 || PakageType == 5){
	    	 byte[] tmpP2SP = new byte[14*6] ;//�������ַ�װ��һ���byte���飬����Ϊ84
		 	 for(int i=0 ; i<JMsg.length; i++){
		 	   tmpP2SP[i] = JMsg[i];
		 	 }
		 	Jmessage = JMesgP2SP(tmpP2SP,usSrcTrackNum,PakageType,SDUnum) ;
	     }
	     /*P4SP��װ*/
	     if(PakageType == 7){
	    	 byte[] tmpP4SP = new byte[14*12] ;//�������ַ�װ��һ���byte���飬����Ϊ168
		 	 for(int i=0 ; i<JMsg.length; i++){
		 		tmpP4SP[i] = JMsg[i];
		 	 }
		 	Jmessage = JMesgP4SP(tmpP4SP,usSrcTrackNum,PakageType,SDUnum) ;
	     }
	     return Jmessage;
	}
	public byte[] JMesgSTDP( byte[] tmpJMesgByte,int usSrcTrackNum,int PakageType,int SDUnum){
		
		String source = test(usSrcTrackNum,15) ;
		byte[] sourceByte = StrToByte(source) ;
        byte[] HeaderByte = HeaderPackage(source, PakageType, SDUnum) ;
        byte[] LastAllJmesg = lastJMesg(sourceByte,tmpJMesgByte);
        
        /*���շ�װ�õ�Jmessage��Ϣ*/
        byte[] Jmessage = arraysConnect(HeaderByte, LastAllJmesg) ;
        //System.out.println(Jmessage.length+"=====STDP52");
        return Jmessage ;
		//return tmpJMeg2;
	
	} 
	public byte[] JMesgP2SP(byte[] tmpJMesgByte,int usSrcTrackNum,int PakageType,int SDUnum){
		
		String source = test(usSrcTrackNum,15) ;
		byte[] sourceByte = StrToByte(source) ;
        byte[] HeaderByte = HeaderPackage( source, PakageType, SDUnum ) ;
        
        // ��ȡǰ�������ֽ���CRCУ�飬���յõ�����75����IEC��Ϣ
        byte[] tmpJmesg0_3 = Arrays.copyOfRange(tmpJMesgByte, 0, 42);
		byte[] LastAllJmesg1 = lastJMesg(sourceByte,tmpJmesg0_3);
		
		// ��ȡ���������ֽ���CRCУ�飬���յõ�����75����IEC��Ϣ
		byte[] tmpJmesg3_6 = Arrays.copyOfRange(tmpJMesgByte, 42, 84);
		byte[] LastAllJmesg2 = lastJMesg(sourceByte,tmpJmesg3_6);
		byte[] LastAllJmesg = arraysConnect(LastAllJmesg1, LastAllJmesg2) ;
		// ���շ�װ�õ�Jmessage��Ϣ
        byte[] Jmessage = arraysConnect(HeaderByte, LastAllJmesg) ;
        //System.out.println(Jmessage.length+"=====P2SP97");
        return Jmessage ;
	}
    public byte[]  JMesgP4SP(byte[] tmpJMesgByte,int usSrcTrackNum,int PakageType,int SDUnum){
    	
    	String source = test(usSrcTrackNum,15) ;
		byte[] sourceByte = StrToByte(source) ;
        byte[] HeaderByte = HeaderPackage( source, PakageType ,SDUnum) ;
        
        // ��ȡ0-3���ֽ���CRCУ�飬���յõ�����75����IEC��Ϣ
        byte[] tmpJmesg0_3 = Arrays.copyOfRange(tmpJMesgByte, 0, 42);
		byte[] LastAllJmesg1 = lastJMesg(sourceByte,tmpJmesg0_3);
		
		// ��ȡ3-6���ֽ���CRCУ�飬���յõ�����75����IEC��Ϣ
		byte[] tmpJmesg3_6 = Arrays.copyOfRange(tmpJMesgByte, 42, 84);
		byte[] LastAllJmesg2 = lastJMesg(sourceByte,tmpJmesg3_6);
		
		// ��ȡ6-9���ֽ���CRCУ�飬���յõ�����75����IEC��Ϣ
		byte[] tmpJmesg6_9 = Arrays.copyOfRange(tmpJMesgByte, 84, 126);
		byte[] LastAllJmesg3 = lastJMesg(sourceByte, tmpJmesg6_9);

		// ��ȡ9-12���ֽ���CRCУ�飬���յõ�����75����IEC��Ϣ
		byte[] tmpJmesg9_12 = Arrays.copyOfRange(tmpJMesgByte, 126, 168);
		byte[] LastAllJmesg4 = lastJMesg(sourceByte, tmpJmesg9_12);
		//��������byte��������
		byte[] tmpLastJmesg1 = arraysConnect(LastAllJmesg1, LastAllJmesg2) ;
		byte[] tmpLastJmesg2 = arraysConnect(LastAllJmesg3, LastAllJmesg4) ;
		byte[] tmpLastJmesg3 = arraysConnect(HeaderByte, tmpLastJmesg1) ;
		// ���շ�װ�õ�Jmessage��Ϣ
        byte[] Jmessage = arraysConnect(tmpLastJmesg3, tmpLastJmesg2) ;
        //System.out.println(Jmessage.length+"=====P4SP187");
		return Jmessage;
		
	}
	public static byte[] HeaderPackage(String source,int PakageType,int SDUnum ){
		
		 //��ͷ�Ķ����Լ�byte����ת��
	    String pakageType = test(PakageType,3) ;
	    String SDU = test(SDUnum, 16);
	    String header = pakageType +  "0" + source + SDU ;
	    byte[] HeaderByte = HeaderToByte(header) ;
		return HeaderByte;
	}
	
      /*ÿ�������ֵ�(237,225)У��õ�������75����IEC��Ϣ*/
	public static byte[] lastJMesg(byte[] sourceByte, byte[] tmpJMesgByte) {

		byte[] Check225 = arraysConnect(sourceByte, tmpJMesgByte);
		byte[] Check = { 0, 0, 0 };
		byte[] Check237 = arraysConnect(Check225, Check);

		int checkCRC = J_Message_Checkout(Check237);
		
		String checkcode = test(checkCRC, 12);
		//System.out.println(checkcode + "+++++");

		String checkMesgI = checkcode.substring(0, 4);
		String checkMesgE = checkcode.substring(4, 8);
		String checkMesgC = checkcode.substring(8, 12);

		// 3�����ֵ�У��λת��Ϊbyte����
		String MesgIcheck5 = "0" + checkMesgI;
		//System.out.println(MesgIcheck5+"===CRCMesgI");
		byte[] MesgIbyte5 = MesgToByte(MesgIcheck5);
		String MesgEcheck5 = "0" + checkMesgE;
		//System.out.println(MesgEcheck5+"===CRCMesgE");
		byte[] MesgEbyte5 = MesgToByte(MesgEcheck5);
		String MesgCcheck5 = "0" + checkMesgC;
		//System.out.println(MesgCcheck5+"===CRCMesgC");
		byte[] MesgCbyte5 = MesgToByte(MesgCcheck5);

		// ������3�����ֵ�42byte�����ȡ������14λbyte����*/
		byte[] MesgI = Arrays.copyOfRange(tmpJMesgByte, 0, 14);// ��ȡ�ַ�����һ��
		byte[] MesgE = Arrays.copyOfRange(tmpJMesgByte, 14, 28);
		byte[] MesgC = Arrays.copyOfRange(tmpJMesgByte, 28, 42);

		// ����1��byte[14]��Ϣ���Լ�MesgIbyte5У��λ���
		byte[] LastMesgI = arraysConnect(MesgI, MesgIbyte5);

		// ����2��byte[14]��Ϣ���Լ�MesgEbyte5У��λ���
		byte[] LastMesgE = arraysConnect(MesgE, MesgEbyte5);

		// ����3��byte[14]��Ϣ���Լ�MesgCbyte5У��λ���
		byte[] LastMesgC = arraysConnect(MesgC, MesgCbyte5);

		byte[] tmp = arraysConnect(LastMesgI, LastMesgE);
		byte[] LastAllMesg = arraysConnect(tmp, LastMesgC);
		//System.out.println(LastAllMesg.length+"====IEClength");// ����ӦΪ45

		return LastAllMesg;
	}

	
    
	public static String test(int target,int bitNumber){
		String binTarget = Integer.toBinaryString(target);
		bitNumber = bitNumber-binTarget.length();
		for(int i =0;i<bitNumber;i++)
			binTarget = "0"+binTarget;
		return binTarget;
		
	}
	
	/*15����Դ������ת��Ϊbyte���飬����Ϊ3*/
	public static byte[]  StrToByte(String s){
		//char[] temp = s.toCharArray();
		////System.out.println(temp);
		int length = s.length();
		char[] ch = new char[15];
		ch = s.toCharArray();	
		byte[] data = new byte[3];
		
		for (int j=0;j<3;j++){
			for (int i=0;i<5;i++){
				int m = i+(5*j);
				if(m<length){
					if (ch[m] == '1'){
						data[j] |= (1<<(4-i));
					}
				}
			}
			
		}
		return data ;
	}
	
	/*5������ϢУ��λת��Ϊbyte���飬����Ϊ1*/
	public static byte[]  MesgToByte(String s){
		//char[] temp = s.toCharArray();
		////System.out.println(temp);
		int length = s.length();
		char[] ch = new char[5];
		ch = s.toCharArray();	
		byte[] data = new byte[1];
		
		for (int j=0;j<1;j++){
			for (int i=0;i<5;i++){
				int m = i+(5*j);
				if(m<length){
					if (ch[m] == '1'){
						data[j] |= (1<<(4-i));
					}
				}
			}
			
		}
		return data ;
	}
	
	/*35���ر�ͷת��Ϊbyte���飬����Ϊ7*/
	public static byte[]  HeaderToByte(String s){
		//char[] temp = s.toCharArray();
		////System.out.println(temp);
		int length = s.length();
		char[] ch = new char[35];
		ch = s.toCharArray();	
		byte[] data = new byte[7];
		
		for (int j=0;j<7;j++){
			for (int i=0;i<5;i++){
				int m = i+(5*j);
				if(m<length){
					if (ch[m] == '1'){
						data[j] |= (1<<(4-i));
					}
				}
			}
			
		}
		return data ;
	}
	
	/*byte��������Ӻ���*/
	public static byte[] arraysConnect(byte[] target1 , byte[] target2){
		byte[] result = new byte[target1.length + target2.length] ;
		System.arraycopy(target1,0,result,0,target1.length);
		System.arraycopy(target2,0,result,target1.length,target2.length);
		return result;
	}
	
	/*��237,225��CRCУ�麯��*/
	public static int J_Message_Checkout(byte[] code){
		int G = (int) (Math.pow(2, 12) + 1);
		int Check_code = 0, tmp = 0, i = 13, j = 0, len = 5, flag = 5, total_len = 237,count = 0;
		/*��ȡ13λ������tmp*/
		while (i!=0){
			tmp = insert_bit(tmp, (int)code[j], i, flag, len);	
			i -= len;
			flag -= len;
			if (flag == 0){
				j++;
				flag = 5;
			}
			if (len >= i){
				len = i;
			}
			else{
				len = 5;
			}
		}
		total_len -= 13;
		/*����tmp��λ���ж��ٸ�0*/
		while (total_len!=0)
		{
			i = 13;
			while (i!=0){
				Check_code = read_bit(tmp, i, 1);
				Check_code >>= (i - 1);
				if (Check_code!=0)
					break;
				count++;
				i--;
			}
			if (total_len >= count){
				tmp <<= count;
				total_len -= count;
				/*��λ��������*/
				while (count!=0){
					tmp = insert_bit(tmp, (int)code[j], count, flag, 1);
					flag--;
					count--;
					if (flag ==0)
					{
						j++;
						flag = 5;
					}
				}
				tmp ^= G;
			}
			else{
				tmp <<= total_len;
				count = total_len;
				total_len = 0;
				while (count!=0){
					tmp = insert_bit(tmp, (int)code[j], count, flag, 1);
					flag--;
					count--;
					if (flag==0)
					{
						j++;
						flag = 5;
					}
				}
			}		
		}
		Check_code = tmp;
		return Check_code;
	}
	public static int read_bit(int x, int location, int len){
		
		int num = location - len;
		len =(int ) (Math.pow(2, len) - 1);
		len <<= num;
		x &= len;
		return x;
	}
	
	public static int insert_bit(int x, int y, int location_x, int location_y, int len)
	{
		
		y = read_bit(y, location_y, len);

		 if (location_x <= location_y)
		{
			y >>= (location_y - location_x);
			
		 }
		 else
		 {
			 y <<= (location_x - location_y);
		 }
		 x += y;
		return x;
   }

}

