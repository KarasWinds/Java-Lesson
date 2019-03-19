/*
糶ㄧ计boolean mersennePrime (int n)ノㄓ耞n琌Mersenne借计
级糶祘Αт玡8Mersenne借计
 */

public class MersennePrime {
	static int pow(int x, int n) {
		int pow = 1;
		for (int i = 1; i <= n; i++)
			pow *= x;
		return pow;
	}

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
		int N = 8;
		int i = 1;
		int Num;
		System.out.println("玡" + N + "Mersenne借计:");
		do {
			Num = pow(2, i) - 1;
			if (PrimeN(Num)) {
				System.out.println(Num);
				N -= 1;
			}
			i++;
		} while (N > 0);

	}

}
