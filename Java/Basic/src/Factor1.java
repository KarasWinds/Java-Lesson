/*
Integer.parseInt(args[0])
©R¥O¦C¤Þ¼Æ(String>Int)
 */
public class Factor1 {
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
		int A = Integer.parseInt(args[0]);
		System.out.print(factorial(A));
	
	}

}
