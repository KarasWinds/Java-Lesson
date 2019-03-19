
public class Greetings {

	public static void main(String[] args) {
		String[] greetings = { "Hello", "Hi!", "Good" };
		try {
			for (int i = 0; i <= greetings.length; i++) {
				System.out.println(greetings[i]);
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
