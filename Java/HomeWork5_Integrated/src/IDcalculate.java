
public abstract class IDcalculate {
	private static String IDL;
	private static String IDLcode;
	private static boolean IDcheck;

	static String getIDLcode(String IDL) {
		IDL = IDL.toUpperCase();
		String[] IDLa = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "M", "N", "O", "P", "Q", "T", "U", "V",
				"W", "X", "Z", "L", "R", "S", "Y" };
		String[] IDcodea = { "10", "11", "12", "13", "14", "15", "16", "17", "34", "18", "19", "21", "22", "35", "23",
				"24", "27", "28", "29", "32", "30", "33", "20", "25", "26", "31" };
		for (int i = 0; i < IDLa.length; i++) {
			if (IDLa[i].equals(IDL)) {
				IDLcode = IDcodea[i];
				break;
			} else if (i == IDLa.length - 1) {
				System.out.print("IDL input error");
				break;
			}
		}
		return IDLcode;
	}

	static boolean getIDcheck(String ID) {
		int[] check = { 1, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1 };
		int checknum = 0;
		IDL = String.valueOf(ID.charAt(0));
		IDLcode = getIDLcode(IDL);
		ID = IDLcode + ID.substring(1);
		if (ID.length() != 11) {
			System.out.print("ID input error ");
		}
		for (int i = 0; i < check.length; i++) {
			checknum += (ID.charAt(i) - '0') * check[i];
		}
		if (checknum % 10 == 0) {
			IDcheck = true;
		}
		return IDcheck;
	}

	IDcalculate() {

	}

}
