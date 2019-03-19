
public class IDGenerator {
	public static String IDcreative() {
		String[] IDL = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "M", "N", "O", "P", "Q", "T", "U", "V",
				"W", "X", "Z", "L", "R", "S", "Y" };
		String[] IDN = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
		String ID;
		String IDA = IDL[(int) (Math.random() * 26)] + IDN[(int) (Math.random() * 2)];
		for (int i = 1; i < 8; i++) {
			IDA += IDN[(int) (Math.random() * 10)];
		}
		do {
			ID = IDA + IDN[(int) (Math.random() * 10)];
		} while (IDcalculate.getIDcheck(ID) == false);
		return ID;
	}

	public static void main(String[] args) {

		System.out.print(IDcreative());

	}

}
