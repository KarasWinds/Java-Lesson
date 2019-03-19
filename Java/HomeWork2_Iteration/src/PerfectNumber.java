/*
计璝单ㄤ┮Τ计羆㎝玥计perfect number
т100ず┮ΤЧ计
弧6计1, 2, 36=1+2+3珿6Ч计
 */
public class PerfectNumber {

	public static void main(String[] args) {
		int n = 100;
		int J = 0;
		for (int i = 6; i <= n; i++) {
			J = 0;
			for (int j = 1; j < i; j++) {
				if (i%j == 0) {
					J += j;
				}
			}
			if (J == i) {
				System.out.print(i + "\t");
			}
		}

	}

}
