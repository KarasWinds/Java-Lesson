
public class Circle implements Shape {
	private int r;
	
	public Circle(int r){
		this.r = r;
	}

	public double computerArea() {
		double Area = r * r * PI;
		return Area;
	}

	public double computerCircumference() {
		double Circumference = 2 * r * PI;
		return Circumference;
	}

}
