import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入工讀生工作時數(hr)");
		int workhr = scanner.nextInt();
		scanner.close();
		int hr1 = 60;
		int hr2 = 80;
		double pay = 0;
		double pay1 = 120;
		double pay2 = pay1 * 1.25;
		double pay3 = pay1 * 1.5;
		if (workhr <= hr1) {
			pay = workhr * pay1;			
		}
		else if (workhr > hr1 && workhr <=80) {
			pay = hr1 * pay1 + (workhr - hr1) * pay2;
		}
		else if (workhr > hr2) {
			pay = hr1 * pay1 + (hr2 - hr1) * pay2 + (workhr - hr2)*pay3;
		}
		int totalpay = (int)pay;
		System.out.println("工讀生工作時數"+ workhr +"小時,合計薪水共" + totalpay +"元");
	}

}
