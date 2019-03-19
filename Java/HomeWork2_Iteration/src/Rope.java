/*
若有一條繩子長3000公尺，每天剪去一半的長度，需多少天繩子的長度會短於5公尺。
 */

public class Rope {

	public static void main(String[] args) {
		double l = 3000;
		int n = 0;
		while (l >= 5) {
			l /= 2;
			n++;
		}
		System.out.println(n + "天");
	}

}
