/*
�@�ӼƦr�Y�����Ҧ��]�ƪ��`�M�A�h���Ƭ�perfect number�C
��X100�H���Ҧ��������ơC
�����G6���]�Ƭ�1, 2, 3�A6=1+2+3�A�G6�������ơC
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
