import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("a");
		int a = scanner.nextInt();
		System.out.println("b");
		int b = scanner.nextInt();
		System.out.println("c");
		int c = scanner.nextInt();
		scanner.close();
		double RR = b * b - 4 * a * c;
		if (RR > 0) {
			double x1 = (-b + Math.sqrt(RR)) / (2 * a);
			double x2 = (-b - Math.sqrt(RR)) / (2 * a);					
			System.out.println("����Ӥ��۵�����ڡA���O��" + x1 + "&" + x2);
		}
		else if (RR == 0) {
			double x = (- b) / (2 * a);
			System.out.println("����Ӭ۵�����ڡA��" + x);
		}
		else if (RR < 0) {
			System.out.println("�S����ڹ��");
		}

	}

}
