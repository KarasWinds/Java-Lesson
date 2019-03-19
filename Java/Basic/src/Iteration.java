
public class Iteration {
	
	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		while (n <= 10) {
			sum += n;
			n++;
		}
		System.out.println(sum);
		
		n = 1;
		sum = 0;
		do {
			sum += n;
			n++;
		}while(n <= 10);
		System.out.println(sum);
		
		sum = 0;
		for (n = 1; n<=10; n++)
			sum += n;
		System.out.println(sum);
	}
}
