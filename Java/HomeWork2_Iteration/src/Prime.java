/*
��J�@����ơA��X�Ҧ��p��ε��󪺽�ơC
 */
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��J�@����ơA��X�Ҧ��p��ε��󪺽��");
		int N = scanner.nextInt();
		scanner.close();
		System.out.println("�p��ε��󥿾��" + N + "����Ʀ�:");
		if (N == 1) {
			System.out.println("�L���");
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
