/*
寫兩個函數分別為toBinary(int n)和toHexidecimal(int n)
用來將n轉換成二進制和十六進制的值。
 */
public class Convert {
	static String toBinary(int n) {
		String result = "";
		while (n >= 2) {
			result = n % 2 + result;
			n /= 2;
		}
		result = n + result;
		return result;
	}

	static String toHexidecimal(int n) {
		String result = "";
		while (n >= 16) {
			if (n % 16 > 9) {
				result = (char) (n % 16 + 87) + result;
			} else {
				result = n % 16 + result;
			}
			n /= 16;
		}
		if (n > 9) {
			result = (char) (n + 87) + result;
		} else {
			result = n + result;
		}
		return result;
	}

	public static void main(String[] args) {
		int A = 1564;
		System.out.println(toBinary(A));
		System.out.println(Integer.toBinaryString(A));
		System.out.println(toHexidecimal(A));
		System.out.print(Integer.toHexString(A));

	}

}
