
public class PrintfDemo {

	public static void main(String[] args) {
		System.out.printf("/%5d/%n", 123);
		System.out.printf("/%+5d/%n", 123);
		System.out.printf("/%X/%n", 123);
		System.out.printf("/%#X/%n", 123);
		System.out.printf("/%f/%n", 12345.678);
		System.out.printf("/%10.2f/%n", 12345.678);
		System.out.printf("/%-10.1f/%n", 12345.678);
		System.out.printf("/%010.2f/%n", 12345.678);

	}

}
