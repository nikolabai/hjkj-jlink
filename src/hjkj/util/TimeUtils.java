package hjkj.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {

	public static String getCurrentTime(){
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Date date = new Date();
		return sdf.format(date);
	}
	
	public static void main(String[]args){
		System.out.println("当前时间：" + TimeUtils.getCurrentTime());
		System.out.println("15:23".compareTo("08:00"));
		System.out.println("15:23".compareTo("10:00"));
	}

}
