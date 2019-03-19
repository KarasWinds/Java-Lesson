
public class MyCalendar {

	public static void main(String[] args) {
		if (args.length == 1) {
			Calmath.year(Integer.parseInt(args[0]));
		} else if (args.length == 2) {
			Calmath.month(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		} else {
			System.out.print("InputError");
		}

	}
}
