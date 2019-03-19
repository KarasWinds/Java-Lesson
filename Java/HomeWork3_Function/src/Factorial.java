/*
寫一遞迴函數int factorial (int n)用來計算1*2*3*…*n的值。
 */
public class Factorial {
	static int factorical(int n) {
		int result = 1;
		if (n >= 1) {
			result = n * factorical(n - 1);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.print(factorical(1));

	}

}
