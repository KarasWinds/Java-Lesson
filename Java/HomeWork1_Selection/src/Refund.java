import java.util.Scanner;

public class Refund {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���I���B");
		int money = scanner.nextInt();
		System.out.println("��I���B");
		int moneyIn = scanner.nextInt();
		int moneyOut = 0;
		scanner.close();
		if (moneyIn < money) {
			System.out.println("���B����");
		}
		else if (moneyIn == money) {
			System.out.println("�h�´f�U");
		}
		else if (moneyIn > money) {
			moneyOut = moneyIn - money;
			int m1 = moneyOut/500;
			int m2 = moneyOut%500/100;
			int m3 = moneyOut%500%100/50;
			int m4 = moneyOut%500%100%50/10;
			int m5 = moneyOut%500%100%50%10/5;
			int m6 = moneyOut%500%100%50%10%5;
			System.out.println("������B" + moneyOut);
			System.out.println(m1 + "�i" + "500��," + m2 + "�i" + "100��," + m3 + "�T" + "50��," + m4 + "�T" + "10��," + m5 + "�T" + "5��," + m6 + "�T" + "1��");
		}

	}

}
