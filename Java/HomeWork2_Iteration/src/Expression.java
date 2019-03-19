/*
利用for迴圏計算1^2-2^2+3^2-4^2+…+49^2-50^2的值。
 */
public class Expression {

	public static void main(String[] args) {
		int sum = 0;
		for (int n = 1; n <= 49; n += 2)
			sum = sum + n * n - (n+1) * (n+1);
		System.out.println("Answer=" + sum);
	}

}
