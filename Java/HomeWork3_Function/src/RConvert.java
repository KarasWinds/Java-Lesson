/*
�g��Ө�Ƥ��O��toBinary(int n)�MtoHexidecimal(int n)
�ΨӱNn�ഫ���G�i��M�Q���i���
�N�W�z��Ө�Ƨ令���j���
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
