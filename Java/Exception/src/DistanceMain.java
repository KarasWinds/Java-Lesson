
public class DistanceMain {

	public static void main(String[] args) {
		try {
			Distance d1 = new Distance(5,8);
			System.out.println(d1.getFeet() + "ft," + d1.getInch() + "in");
			Distance d2 = new Distance(5,15);
			System.out.println(d2.getFeet() + "ft," + d2.getInch() + "in");
			Distance d3 = new Distance(5,18);
			System.out.println(d3.getFeet() + "ft," + d3.getInch() + "in");
		}catch (OverInchException e) {
			System.out.println(e.getInch() + "in," + e.getMsg());
		}
		

	}

}
