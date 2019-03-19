/*
寫一遞迴函數int sum (int n)用來計算2+4+6…+2n的值。
 */

public class Sum {
	static int sum(int n) {
		int result = 0;
		if (n >= 1) {
			result = 2 * n + sum(n - 1);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.print(sum(1));

	}

}
