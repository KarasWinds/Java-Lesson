/*
ㄆ盢10计竚蝴皚いだт10计い程㎝程
 */
public class MaxMin {

	public static void main(String[] args) {
		int[] data = { 5, 9, 15, 65, 51, 77, 57, 4, 32, 15 };
		int dmax = data[0];
		int dmin = data[0];
		for (int i = 1; i < (data.length - 1); i++) {
			dmax = (dmax < data[i]) ? data[i] : dmax;
			dmin = (dmin > data[i]) ? data[i] : dmin;
		}
		System.out.println(dmax);
		System.out.println(dmin);
	}

}
