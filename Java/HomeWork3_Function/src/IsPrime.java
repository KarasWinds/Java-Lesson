/*
寫一函數boolean isPrime (int n)用來判斷n是否為質數
 */
public class IsPrime {
	static boolean PrimeN(int n) {
		boolean A = true;
		if (n == 0 || n == 1) {
			A = false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				A = false;
				break;
			}
		}
		return A;
	}

	public static void main(String[] args) {
		System.out.println(PrimeN(3));

	}

}
