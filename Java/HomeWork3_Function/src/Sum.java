/*
�g�@���j���int sum (int n)�Ψӭp��2+4+6�K+2n���ȡC
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
