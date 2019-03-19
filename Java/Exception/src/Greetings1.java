
public class Greetings1 {
	static String[] greetings = { "Hello", "Hi!", "Good" };
	public static void printGreetings(int i) {
		System.out.println(greetings[i]);
	}

	public static void main(String[] args) {
		try {
			for (int i = 0; i <= greetings.length; i++) {
				printGreetings(i);
			}
		} catch (ArrayIndexOutOfBoundsException b) {
			// System.err.println(b);
			System.err.println("Index out of bounds");
		} finally {
			System.out.println("pass");
		}

		System.out.println("End of EX");
	}

}