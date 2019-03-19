import java.util.*;
import java.text.*;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int mouth = today.get(Calendar.MONTH);
		int day =  today.get(Calendar.DATE);
		int day_of_week = today.get(Calendar.DAY_OF_WEEK);
		int hour = today.get(Calendar.HOUR_OF_DAY);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		String[] weekarray = {"日","一","二","三","四","五","六"};
		String weekdays = "日一二三四五六";
		System.out.println("今天是" + year + "/" + mouth + "/" + day);
		System.out.println("今天是星期" + weekarray[day_of_week - 1]);
		System.out.println("今天是星期" + weekdays.charAt(day_of_week - 1));
		System.out.println("時間是" + hour + ":" + minute + ":" + second);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		System.out.println("時間是" + sdf.format(today.getTime()));
		System.out.printf("時間是%d:%02d:%02d%n",hour,minute,second);
		System.out.println("時間是" + hour
				+ ":" + ((minute < 10) ? "0"+minute:minute) 
				+ ":" + ((second < 10) ? "0"+second:second));
		
	}
}
