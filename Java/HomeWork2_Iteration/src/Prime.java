/*
块タ俱计т┮Τ┪单借计
 */
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("块タ俱计т┮Τ┪单借计");
		int N = scanner.nextInt();
		scanner.close();
		System.out.println("┪单タ俱计" + N + "借计Τ:");
		if (N == 1) {
			System.out.println("礚借计");
		} else if (N == 2) {
			System.out.println(2 + "\t");
		} else if (N > 2) {
			System.out.println(2 + "\t");
			for (int i = 3; i <= N; i++) {
				int NN = 0;
				for (int j = 2; j <= i; j++) {
					if (i % j != 0) {
						NN += 1;
					}
				}
				if (NN == (i - 2)) {
					System.out.println(i);
				}
			}

		}

	}

}
