/*
�g�@���j���int factorial (int n)�Ψӭp��1*2*3*�K*n���ȡC
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
