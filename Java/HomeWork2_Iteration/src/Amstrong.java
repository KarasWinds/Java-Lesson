/*
Amstrong�ƬO���@�ӤT��ƪ���ơA��U��Ƥ��ߤ�M����Ӽƥ����C
��X�Ҧ���Amstrong�ơC
�����G153=13+53+33�A�G153��Amstrong�ơC
 */

public class Amstrong {

	public static void main(String[] args) {
		for (int i = 0; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				for (int k = 1; k <= 9; k++) {
					int sum = i * 100 + j * 10 + k;
					if (sum == i * i * i + j * j * j + k * k * k) {
						System.out.print(sum + "\t");
					}
				}
			}
		}
	}
}
