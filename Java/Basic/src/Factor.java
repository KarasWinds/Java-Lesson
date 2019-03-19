
public class Factor {
	static long factorial(int num) {
		long result = 1;
		System.out.print(num + "!=");
		for (int i = num; i > 1; i--) {
			result *= i;
			System.out.print(i + "*");
		}
		System.out.print(1 + "=");
		return result;
	}
	public static void main(String[] args) {
		int A = 5;
		System.out.print(factorial(A));
	}

}
