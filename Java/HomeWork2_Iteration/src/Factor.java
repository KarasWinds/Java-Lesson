/*
��J�@����ơA�D��Ҧ����]�ơC
�����G36���]�Ƭ�1, 2, 3, 4, 6, 9, 12, 18, 36�C
 */
import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��J�@����ơA�D��Ҧ����]��");
		int N = scanner.nextInt();
		scanner.close();
		System.out.println("�����" + N + "���]�Ʀ�:" );
		for (int n = 1; n <= N; n++) 
			if (N%n == 0) {
				System.out.println(n);
			}
	}

}
