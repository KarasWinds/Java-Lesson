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
		String[] weekarray = {"��","�@","�G","�T","�|","��","��"};
		String weekdays = "��@�G�T�|����";
		System.out.println("���ѬO" + year + "/" + mouth + "/" + day);
		System.out.println("���ѬO�P��" + weekarray[day_of_week - 1]);
		System.out.println("���ѬO�P��" + weekdays.charAt(day_of_week - 1));
		System.out.println("�ɶ��O" + hour + ":" + minute + ":" + second);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		System.out.println("�ɶ��O" + sdf.format(today.getTime()));
		System.out.printf("�ɶ��O%d:%02d:%02d%n",hour,minute,second);
		System.out.println("�ɶ��O" + hour
				+ ":" + ((minute < 10) ? "0"+minute:minute) 
				+ ":" + ((second < 10) ? "0"+second:second));
		
	}
}
