
public class MainAccount {
	public static void main(String[] args) {
		
		Account A = new Account("127333", 57730.0);
		A.printAccData();
		CheckingAccount B = new CheckingAccount("837444", 18730.0, 20);
		B.printAccData();
		System.out.println("-------------------");
		Account[] Ac = new Account[2];
		Ac[0] = A;
		Ac[1] = B;
		for (int i = 0 ; i < Ac.length ; i ++) {
			Ac[i].printAccData();
		}

	}
}
