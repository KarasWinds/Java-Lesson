/*
�g�@���int prime (int n)�Ψӧ�X��n�ӽ��
 */
public class Prime {
	static int PrimeNo(int n) {
		int Pn = 0;
		int i = 1;
		do {
			i++;
			boolean A = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					A = false;break;
				}
			}
			if (A) {
				Pn += 1;
			}
		} while (Pn < n);
		return i;
	}

	public static void main(String[] args) {
		System.out.println(PrimeNo(168));
	}

}
