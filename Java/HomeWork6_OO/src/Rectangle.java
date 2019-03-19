
public class Rectangle implements Shape {
	private int l , w;
	
	public Rectangle (int l , int w){
		this.l = l;
		this.w = w;
	}

	public double computerArea() {
		double Area = l * w;
		return Area;
	}

	public double computerCircumference() {
		double Circumference = 2 * (l + w);
		return Circumference;
	}

}
