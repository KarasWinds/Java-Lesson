/*
礶贺逼琍琍瓜
 */

public class Stars {

	public static void main(String[] args) {
		System.out.println("(1)");
		for (int i = 1; i <= 5; i++) { //︽计北
			for (int j = 1; j < i; j++) //礶àà*
				System.out.print("* ");
			System.out.println("*"); //干*传︽
		}
		System.out.println("(2)");
		for (int i = 1; i <= 5; i++) { //︽计北
			for (int j = 1; j < i; j++) //干フà跋
				System.out.print("  ");
			for (int k = 5; k > i; k--) //礶àà*
				System.out.print("* ");
			System.out.println("*"); //干*传︽
		}
		System.out.println("(3)");
		for (int i = 1; i <= 5; i++) { //︽计北
			for (int j = 5; j > i; j--) //干フà跋
				System.out.print("  ");
			for (int k = 1; k < i; k++) //礶àà*
				System.out.print("* ");
			for (int l = 1; l < i; l++) //礶àà*
				System.out.print("* ");
			System.out.println("*"); //干*传︽
		}

	}

}
