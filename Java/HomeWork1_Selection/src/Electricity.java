import java.util.Scanner;

public class Electricity {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�аݱz���ιq�����O?(�u�~�ήa�x)");
		String eType = scanner.next();
		System.out.println("�z���ιq�׼ƬO?");
		double kW = scanner.nextInt();
		scanner.close();
		int kWl = 240;
		int kWh = 540;
		double eCash = 0;
		if (eType.equals("�u�~")) {
			eCash = kW * 0.45;			
		}
		else if (eType.equals("�a�x")) {
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
		System.out.println("�z���ιq�����O" + eType + ",�q�O��" + eCash);
	} //end of main()
} //end of class
