package hjkj.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ʱ�乤����
 */

public class TimeUtils {
	
	//��ȡ��ǰʱ��ġ�HH:mm"(��д��H��24Сʱ�ƣ�Сд����12Сʱ��)
	public static String getCurrentTime(){
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Date date = new Date();
		return sdf.format(date);
	}
	
	public static void main(String[]args){
		System.out.println("��ǰʱ���ǣ�" + TimeUtils.getCurrentTime());
		System.out.println("15:23".compareTo("08:00"));
		System.out.println("15:23".compareTo("10:00"));
	}

}
