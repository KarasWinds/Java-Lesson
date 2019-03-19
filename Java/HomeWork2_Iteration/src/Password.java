/*
出現”請輸入密碼”的提示，使用者有最多三次輸入的機會。
若輸入正確，則印出”密碼輸入正確，歡迎使用本系統！”。
若輸入不正確，再次出現”請輸入密碼”的提示。
若三次輸入不正確，則印出”密碼輸入超過三次！”，並結束程式的執行。
 */
import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		String code = "123456";
		int error = 0;
		String Code;
		System.out.println("歡迎使用本系統使用者有最多三次輸入的機會");
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("請輸入密碼");
			Code = scanner.next();
			//scanner.close();
			if (Code.equals(code)) {
				System.out.println("密碼輸入正確，歡迎使用本系統！");
				break;
			}
			else {
				System.out.println("密碼錯誤");
				error++;
			}
			scanner.close();
		}while (error < 3);
		if (error == 3) {
			System.out.println("密碼輸入錯誤超過三次！結束程式");
		}
	}

}