import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�J�褸�~(��2015)�O�_���|�~?");
		int yearAD = scanner.nextInt();
		scanner.close();
		if (yearAD%4 == 0 && yearAD%100 != 0){
			System.out.println("�|�~");
		}
		else if  (yearAD%400 == 0 && yearAD%4000 != 0) {
			System.out.println("�|�~");
		}
		//else if  (yearAD%4000 == 0) {
		//	System.out.println("���~");
		//}
		else {
			System.out.println("���~");
		}
	}

}
