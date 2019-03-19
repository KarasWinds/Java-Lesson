import java.util.Scanner;

public class Electricity {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請問您的用電種類是?(工業或家庭)");
		String eType = scanner.next();
		System.out.println("您的用電度數是?");
		double kW = scanner.nextInt();
		scanner.close();
		int kWl = 240;
		int kWh = 540;
		double eCash = 0;
		if (eType.equals("工業")) {
			eCash = kW * 0.45;			
		}
		else if (eType.equals("家庭")) {
			if (kW<=kWl) {
				eCash = kW * 0.15;
			}
			else if (kW>kWl && kW<=kWh) {
				eCash = kWl * 0.15 + (kW - kWl) * 0.25;
			}
			else if (kW>kWh) {
				eCash = kWl * 0.15 + (kWh - kWl) * 0.25 + (kW - kWh) * 0.45;
			}
		}
		System.out.println("您的用電種類是" + eType + ",電費為" + eCash);
	} //end of main()
} //end of class
