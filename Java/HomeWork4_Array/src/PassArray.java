/*
a~d肈ㄧ计ㄓ矪瞶絤策皚把计肚患皚惠﹚竡main()跋办跑计
ㄆ盢12计竚3 x 4蝴皚いㄧ计挡狦
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
		// a. 璸衡┮Τ计キА
		int sum = 0;
		int num = 0;
		for (int[] m : TwoDim)
			for (int n : m) {
				sum += n;
				num += 1;
			}
		double avg = (double)sum / num;
		System.out.println("(a.)" + avg);
		// b. т12计い程
		// c. т12计い程
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
		// d. 璸衡–舱ず4计キА
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
