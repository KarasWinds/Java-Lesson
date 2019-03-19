
public class ArrayForEachDemo {

	public static void main(String[] args) {
		int sum = 0;
		int[] oneDim = { 2, 6, 1, 4, 3, 5 };
		for (int n : oneDim)
			sum += n;
		System.out.println(sum);
		sum = 0;
		int[][] twoDim = { { 2, 6, 1 }, { 4, 3, 5 } };
		for (int[] m : twoDim)
			for (int n : m)
				sum += n;
		System.out.println(sum);
		sum = 0;
		int[][][] threeDim = { { { 2, 6, 1 }, { 4, 3, 5 } }, { { 2, 6, 1 }, { 4, 3, 5 } },
				{ { 2, 6, 1 }, { 4, 3, 5 } } };// 3 x 2 x 3
		for (int[][] m : threeDim)
			for (int[] n : m)
				for (int o : n)
					sum += o;
		System.out.println(sum);

	}

}
