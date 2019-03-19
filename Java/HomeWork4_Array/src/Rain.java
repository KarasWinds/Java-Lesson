import java.util.Scanner;

public class Rain {
	static double[][][] rain(int X, int Y, int Z) {
		double[][][] rain = new double[X][Y][Z];
		for (int i = 0; i < rain.length; i++) {
			System.out.println("\t" + "��" + (i + 1) + "�~");
			for (int j = 0; j < rain[i].length; j++) {
				for (int k = 0; k < rain[i][j].length; k++) {
					rain[i][j][k] = (int) (Math.random() * 5000);
					rain[i][j][k] /= 10;
					System.out.print(rain[i][j][k] + "\t");
				}
				System.out.println();
			}
		}
		return rain;
	}

	public static void main(String[] args) {
		double[][][] rain = rain(5, 4, 3);
		double answer = 0;
		int N = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�J���d�߭��B�q��ƫ��A?");
		String Type = scanner.next();
		if (Type.equals("all")) {
			for (double[][] m : rain)
				for (double[] n : m)
					for (double o : n) {
						answer += o;
						N += 1;
					}
			answer /= N;
			System.out.printf("�������B�q������" + "%3.1f", answer);
		} else if (Type.equals("year")) {
			System.out.print("�п�J���d�ߦ~��?");
			int Date = scanner.nextInt();
			if (Date < 1 || Date > 5) {
				System.out.print("�~����J���~");
			}
			for (double[] m : rain[Date - 1])
				for (double n : m) {
					answer += n;
					N += 1;
				}
			answer /= N;
			System.out.printf("��" + Date + "�~�A���B�q������" + "%3.1f", answer);
		} else if (Type.equals("season")) {
			System.out.print("�п�J���d�߭��B�q�u��?");
			int Date = scanner.nextInt();
			if (Date < 1 || Date > 4) {
				System.out.print("�u�׿�J���~");
			}
			for (double[][] m : rain)
				for (double n : m[Date - 1]) {
					answer += n;
					N += 1;
				}
			answer /= N;
			System.out.printf("��" + Date + "�u�A���B�q������" + "%3.1f", answer);
		} else if (Type.equals("month")) {
			System.out.print("�п�J���d�߭��B�q���?");
			int Date = scanner.nextInt();
			if (Date < 1 || Date > 12) {
				System.out.print("�����J���~");
			}
			for (double[][] m : rain) {
				int MN = 0;
				for (double[] n : m)
					for (double o : n) {
						MN += 1;
						if (MN == Date) {
							answer += o;
							N += 1;
						}
					}
			}
			answer /= N;
			System.out.printf(Date + "��A���B�q������" + "%3.1f", answer);
		} else
			System.out.print("�п�J���T���d�߫��A(all.year.season.month)");
		scanner.close();
	}

}
