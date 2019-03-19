/*
¼g¤@¨ç¼Ædouble my_fun (double x, int n)
 */

public class Sigma {
	static long factorial(int num) {
		long result = 1;
		for (int i = num; i > 1; i--) {
			result *= i;
		}
		return result;
	}

	static double pow(double x, double n) {
		double pow = 1;
		for (int i = 1; i <= n; i++)
			pow *= x;
		return pow;
	}

	static double my_fun(double x, int n) {
		double sigma = 0;
		for (int i = 1; i <= n; i++) {
			sigma += pow(x, i) / factorial(i);
		}
		return sigma;
	}

	public static void main(String[] args) {
		System.out.println(my_fun(5, 2));
	}

}
