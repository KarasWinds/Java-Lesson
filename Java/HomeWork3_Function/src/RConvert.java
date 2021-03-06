/*
寫兩個函數分別為toBinary(int n)和toHexidecimal(int n)
用來將n轉換成二進制和十六進制的值
將上述兩個函數改成遞迴函數
 */

public class RConvert {
	static String toBinary(int n) {
		String result = "";
		if (n >= 2) {
			result += toBinary(n / 2);
		}
		result += n % 2;
		return result;
	}

	static String toHexidecimal(int n) {
		String result = "";
		if (n >= 16) {
			result += toHexidecimal(n / 16);
		}
		if (n % 16 > 9) {
			result += (char) (n % 16 + 87);
		} else {
			result += n % 16;
		}
		return result;
	}

	public static void main(String[] args) {
		int A = 5000;
		System.out.println(toBinary(A));
		System.out.println(Integer.toBinaryString(A));
		System.out.println(toHexidecimal(A));
		System.out.print(Integer.toHexString(A));
	}

}
