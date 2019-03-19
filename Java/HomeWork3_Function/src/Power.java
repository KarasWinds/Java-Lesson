/*
寫一函數int power(int x, int n)用來計算x的n次方
 */

public class Power {
	static int pow (int x, int n) {
		int pow = 1;
		for (int i = 1; i <= n; i++)
			pow *= x;
		return pow;
	}
	public static void main(String[] args) {
		System.out.println(pow(2,5));
	}

}
