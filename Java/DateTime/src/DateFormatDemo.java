import java.util.*;
import java.text.*;

public class DateFormatDemo {

	public static void main(String[] args) {
		long start = new java.util.Date().getTime();
		long start1 = System.currentTimeMillis();
		
		Calendar cal = new GregorianCalendar(1985,Calendar.APRIL,8);
		Date myDate = cal.getTime();
		int c_year = cal.get(Calendar.YEAR) - 1911;
		DateFormat df1 = DateFormat.getDateTimeInstance();
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat df3 = new SimpleDateFormat("年M月d日");
		System.out.println(df1.format(myDate));
		System.out.println(df2.format(myDate));
		System.out.println("民國" + c_year + df3.format(myDate));
		
		long end = new java.util.Date().getTime();
		long end1 = System.currentTimeMillis();
		System.out.println("time:" + (end - start) + "ms");
		System.out.println("time:" + (end1 - start1) + "ms");
		
	}

}
