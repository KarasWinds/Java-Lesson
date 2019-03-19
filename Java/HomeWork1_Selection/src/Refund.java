import java.util.Scanner;

public class Refund {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("應付金額");
		int money = scanner.nextInt();
		System.out.println("實付金額");
		int moneyIn = scanner.nextInt();
		int moneyOut = 0;
		scanner.close();
		if (moneyIn < money) {
			System.out.println("金額不足");
		}
		else if (moneyIn == money) {
			System.out.println("多謝惠顧");
		}
		else if (moneyIn > money) {
			moneyOut = moneyIn - money;
			int m1 = moneyOut/500;
			int m2 = moneyOut%500/100;
			int m3 = moneyOut%500%100/50;
			int m4 = moneyOut%500%100%50/10;
			int m5 = moneyOut%500%100%50%10/5;
			int m6 = moneyOut%500%100%50%10%5;
			System.out.println("應找金額" + moneyOut);
			System.out.println(m1 + "張" + "500元," + m2 + "張" + "100元," + m3 + "枚" + "50元," + m4 + "枚" + "10元," + m5 + "枚" + "5元," + m6 + "枚" + "1元");
		}

	}

}
