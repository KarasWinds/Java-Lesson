/*
�X�{���п�J�K�X�������ܡA�ϥΪ̦��̦h�T����J�����|�C
�Y��J���T�A�h�L�X���K�X��J���T�A�w��ϥΥ��t�ΡI���C
�Y��J�����T�A�A���X�{���п�J�K�X�������ܡC
�Y�T����J�����T�A�h�L�X���K�X��J�W�L�T���I���A�õ����{��������C
 */
import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		String code = "123456";
		int error = 0;
		String Code;
		System.out.println("�w��ϥΥ��t�ΨϥΪ̦��̦h�T����J�����|");
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("�п�J�K�X");
			Code = scanner.next();
			//scanner.close();
			if (Code.equals(code)) {
				System.out.println("�K�X��J���T�A�w��ϥΥ��t�ΡI");
				break;
			}
			else {
				System.out.println("�K�X���~");
				error++;
			}
			scanner.close();
		}while (error < 3);
		if (error == 3) {
			System.out.println("�K�X��J���~�W�L�T���I�����{��");
		}
	}

}