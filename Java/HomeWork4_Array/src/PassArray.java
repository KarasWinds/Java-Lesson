/*
a~d�U�p�D�ҥH�@��ƨӳB�z�G���m�߰}�C���Ѽƶǻ��A�}�C�ݩw�q��main()���ϰ��ܼơA
�ƥ��N12�ӼƦr�m��@3 x 4���G���}�C���A�C�L�U��ƪ����G�C
 */
public class PassArray {

	public static void main(String[] args) {
		int[][] TwoDim = new int[3][4];
		for (int i = 0; i < TwoDim.length; i++) {
			for (int j = 0; j < TwoDim[i].length; j++) {
				TwoDim[i][j] = (int) (Math.random() * 50);
				System.out.print(TwoDim[i][j] + "\t");
			}
			System.out.println();
		}
		// a. �p��Ҧ��Ʀr��������
		int sum = 0;
		int num = 0;
		for (int[] m : TwoDim)
			for (int n : m) {
				sum += n;
				num += 1;
			}
		double avg = (double)sum / num;
		System.out.println("(a.)" + avg);
		// b. ��X12�ӼƦr���̤j����
		// c. ��X12�ӼƦr���̤p����
		int max = TwoDim[0][0];
		int min = TwoDim[0][0];
		for (int[] m : TwoDim)
			for (int n : m)
				if (max < n) {
					max = n;
				} else if (min > n) {
					min = n;
				}
		System.out.println("(b.)" + max);
		System.out.println("(c.)" + min);
		// d. �p��C�դ�4�ӼƦr��������
		int NN = 0;
		double[] Pavg = new double[TwoDim.length];
		for (int[] m : TwoDim) {
			sum = 0;
			num = 0;
			for (int n : m) {
				sum += n;
				num += 1;
			}
			Pavg[NN] = (double)sum / num;
			NN += 1;
		}
		System.out.println("(d.)" + Pavg[0] + "," + Pavg[1] + "," + Pavg[2]);
	}

}
