/*
老王養了一群兔子，若三隻三隻一數，剩餘一隻；若五隻五隻一數，剩餘三隻；
若七隻七隻一數，剩餘二隻。試問兔子最少有幾隻。
 */
public class Rabbit {

	public static void main(String[] args) {
	int X = 0, A = 0,n = 1;
	while (A == 0) {
		X = 7 * n + 2;
		if (X % 5 == 3 && X % 3 == 1) {
			A = 1;
		}
		n++;
	}
	System.out.println("兔子最少有" + X + "隻");
	}

}