
public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			System.out.println("Exception handling in main()");
		}

	}

	public static void method() throws Exception {
		try {
			System.out.println("in meht()");
		// } catch (Exception e ) {
		} catch (RuntimeException e) {
			System.out.println("Exception handling in method()");
		}
	}
}
