import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�J���(1~12)");
		int mouthNo = scanner.nextInt();
		scanner.close();
		switch (mouthNo) {
		case 1:
		case 2:
		case 3: System.out.println("���V�N��!!");break;
		case 4:
		case 5:
		case 6: System.out.println("�K�x��}~");break;
		case 7:
		case 8:
		case 9: System.out.println("�i���L��!!");break;
		case 10:
		case 11:
		case 12: System.out.println("��}�}~");break;
		default: System.out.println("�п�J�Ʀr1~12��!��}");
		}
			
	}

}
