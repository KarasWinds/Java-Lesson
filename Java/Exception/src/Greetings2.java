
public class Greetings2 {
	String[] greetings = { "Hello", "Hi!", "Good" };

	public void printGreetings(int i) throws Exception {
		System.out.println(greetings[i]);
	}

	Greetings2() {

	}

	public static void main(String[] args) {
		Greetings2 g = new Greetings2();
		try {
			for (int i = 0; i <= g.greetings.length; i++) {
				g.printGreetings(i);
			}
		} catch (ArrayIndexOutOfBoundsException b) {
			System.err.println("Index out of bounds");
		} catch (Exception b) {
			System.err.println("Exception happend");
		} finally {
			System.out.println("pass");
		}

		System.out.println("End of EX");
	}

}