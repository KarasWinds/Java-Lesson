/*
印出九九乘法表
 */


public class NineNine {

	public static void main(String[] args) {
		System.out.print("\t|\t");
		for (int i = 1; i <= 9; i++)
			System.out.print(i + "\t");
		System.out.println("\n-----------------------------------------------------------------------------------");
		for (int j = 9; j >= 1; j--) {
			System.out.print(j + "\t|\t");
			for (int k = 1; k <= 9; k++) {
				System.out.print(j * k + "\t");
				if (k == j) {
					System.out.println("\t");
					break;
				}

			}
		}

	}

}
