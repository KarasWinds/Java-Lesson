/*
�e�X�U�C�T�رƦC���P�P�ϧΡC
 */

public class Stars {

	public static void main(String[] args) {
		System.out.println("(1)");
		for (int i = 1; i <= 5; i++) { //��Ʊ���
			for (int j = 1; j < i; j++) //�e�p�����T����*
				System.out.print("* ");
			System.out.println("*"); //��*�B����
		}
		System.out.println("(2)");
		for (int i = 1; i <= 5; i++) { //��Ʊ���
			for (int j = 1; j < i; j++) //�ɪťդT����
				System.out.print("  ");
			for (int k = 5; k > i; k--) //�e�ˤp�����T����*
				System.out.print("* ");
			System.out.println("*"); //��*�B����
		}
		System.out.println("(3)");
		for (int i = 1; i <= 5; i++) { //��Ʊ���
			for (int j = 5; j > i; j--) //�ɪťդT����
				System.out.print("  ");
			for (int k = 1; k < i; k++) //�e�p�����T����*
				System.out.print("* ");
			for (int l = 1; l < i; l++) //�e�p�����T����*
				System.out.print("* ");
			System.out.println("*"); //��*�B����
		}

	}

}
