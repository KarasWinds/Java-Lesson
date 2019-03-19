/*
块タ俱计―ㄤ┮Τ计
弧36计1, 2, 3, 4, 6, 9, 12, 18, 36
 */
import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("块タ俱计―ㄤ┮Τ计");
		int N = scanner.nextInt();
		scanner.close();
		System.out.println("タ俱计" + N + "计Τ:" );
		for (int n = 1; n <= N; n++) 
			if (N%n == 0) {
				System.out.println(n);
			}
	}

}
