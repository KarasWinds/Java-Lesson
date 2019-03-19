import java.util.Scanner;

public class Rain {
	static double[][][] rain(int X, int Y, int Z) {
		double[][][] rain = new double[X][Y][Z];
		for (int i = 0; i < rain.length; i++) {
			System.out.println("\t" + "第" + (i + 1) + "年");
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
		System.out.print("請輸入欲查詢降雨量資料型態?");
		String Type = scanner.next();
		if (Type.equals("all")) {
			for (double[][] m : rain)
				for (double[] n : m)
					for (double o : n) {
						answer += o;
						N += 1;
					}
			answer /= N;
			System.out.printf("全部降雨量平均為" + "%3.1f", answer);
		} else if (Type.equals("year")) {
			System.out.print("請輸入欲查詢年份?");
			int Date = scanner.nextInt();
			if (Date < 1 || Date > 5) {
				System.out.print("年份輸入錯誤");
			}
			for (double[] m : rain[Date - 1])
				for (double n : m) {
					answer += n;
					N += 1;
				}
			answer /= N;
			System.out.printf("第" + Date + "年，降雨量平均為" + "%3.1f", answer);
		} else if (Type.equals("season")) {
			System.out.print("請輸入欲查詢降雨量季度?");
			int Date = scanner.nextInt();
			if (Date < 1 || Date > 4) {
				System.out.print("季度輸入錯誤");
			}
			for (double[][] m : rain)
				for (double n : m[Date - 1]) {
					answer += n;
					N += 1;
				}
			answer /= N;
			System.out.printf("第" + Date + "季，降雨量平均為" + "%3.1f", answer);
		} else if (Type.equals("month")) {
			System.out.print("請輸入欲查詢降雨量月份?");
			int Date = scanner.nextInt();
			if (Date < 1 || Date > 12) {
				System.out.print("月份輸入錯誤");
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
			System.out.printf(Date + "月，降雨量平均為" + "%3.1f", answer);
		} else
			System.out.print("請輸入正確的查詢型態(all.year.season.month)");
		scanner.close();
	}

}
