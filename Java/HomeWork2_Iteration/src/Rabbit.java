/*
�Ѥ��i�F�@�s�ߤl�A�Y�T���T���@�ơA�Ѿl�@���F�Y���������@�ơA�Ѿl�T���F
�Y�C���C���@�ơA�Ѿl�G���C�հݨߤl�̤֦��X���C
 */
public class Rabbit {

	public static void main(String[] args) {
	int X = 0, A = 0,n = 1;
	while (A == 0) {
		X = 7 * n + 2;
		if (X % 5 == 3 && X % 3 == 1) {
			A = 1;
		}
		n++;
	}
	System.out.println("�ߤl�̤֦�" + X + "��");
	}

}