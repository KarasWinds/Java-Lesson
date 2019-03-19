
public class Calmath {

	private static final boolean leapYear(int year) {
		boolean leapyear;
		int yearAD = year;
		leapyear = ((yearAD % 4 == 0 && yearAD % 100 != 0) || (yearAD % 400 == 0 && yearAD % 4000 != 0))?true:false;
		return leapyear;
	}
	
	private static final int monthdays(int year, int month) {
		int monthdays;
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		days[1] = (month == 2 && Calmath.leapYear(year))?29:28;
		monthdays = days[month-1];
		return monthdays;
	}

	private static final int zeller(int year, int month, int day) {
		if (month == 1 || month == 2) {
			year --;
			month += 12;
		}
		int c = year / 100;
		int y = year % 100;
		int m = month;
		int d = day;
		int w = ((y + y / 4 + c / 4 - 2 * c + (26 * (m + 1)) / 10 + d - 1) % 7 + 7) % 7; // w = (w + 7) % 7 去除負值
		return w;
	}

	private static StringBuffer monthCalendar(int year, int month) {
		int w = Calmath.zeller(year, month, 1);
		int days = Calmath.monthdays(year, month);
		StringBuffer weekdays = new StringBuffer("日\t一\t二\t三\t四\t五\t六\n");
		for (int j = 0; j < w + days; j++) {
			if(j < w)
				weekdays.append("" + "\t");
			if(j >= w)
				weekdays.append((j - w + 1) + "\t");
			if((j + 1)%7 == 0)
				weekdays.append("\n");
		}
		return weekdays;
	}
	public static void month(int year, int month) {
		StringBuffer weekdays = Calmath.monthCalendar(year, month);
		StringBuffer title = new StringBuffer();
		System.out.println(title.append("\t\t").append(year).append("年\t").append(month).append("月"));
		System.out.println(weekdays);
	}
	
	public static void year(int year) {
		for(int i = 1; i < 13; i++) {
			Calmath.month(year, i);
		}
	}

}
