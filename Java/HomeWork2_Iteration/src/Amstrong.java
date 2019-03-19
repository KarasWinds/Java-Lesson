/*
Amstrong计琌计俱计ㄤ计ぇミよ㎝单赣计セō
т┮ΤAmstrong计
弧153=13+53+33珿153Amstrong计
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
