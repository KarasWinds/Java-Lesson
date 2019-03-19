import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入月份(1~12)");
		int mouthNo = scanner.nextInt();
		scanner.close();
		switch (mouthNo) {
		case 1:
		case 2:
		case 3: System.out.println("凜冬將至!!");break;
		case 4:
		case 5:
		case 6: System.out.println("春暖花開~");break;
		case 7:
		case 8:
		case 9: System.out.println("養眼夏天!!");break;
		case 10:
		case 11:
		case 12: System.out.println("秋風徐徐~");break;
		default: System.out.println("請輸入數字1~12喔!啾咪");
		}
			
	}

}
