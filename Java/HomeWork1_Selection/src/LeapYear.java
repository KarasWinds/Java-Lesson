import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入西元年(例2015)是否為閏年?");
		int yearAD = scanner.nextInt();
		scanner.close();
		if (yearAD%4 == 0 && yearAD%100 != 0){
			System.out.println("閏年");
		}
		else if  (yearAD%400 == 0 && yearAD%4000 != 0) {
			System.out.println("閏年");
		}
		//else if  (yearAD%4000 == 0) {
		//	System.out.println("平年");
		//}
		else {
			System.out.println("平年");
		}
	}

}
