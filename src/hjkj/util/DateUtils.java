package hjkj.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 获取当前时间
 * @author YUB
 *
 */

public class DateUtils{

	public static String now;
	
	public static String getDateString(Date date) {
		SimpleDateFormat formater = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String dateStr = formater.format(date);
		return dateStr;
	}
	
	public static String getNowDate() {
		return getDateString(new Date());
	}

	public static void main(String[] args) {
		System.out.println(getNowDate());
	}

}
