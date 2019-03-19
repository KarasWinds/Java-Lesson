
public class ShapeMain {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		System.out.println("Circle Area = " + c.computerArea());
		System.out.println("Circle Circumference = " + c.computerCircumference());
		Rectangle r = new Rectangle(5,3);
		System.out.println("Rectangle Area = " + r.computerArea());
		System.out.println("Rectangle Circumference = " + r.computerCircumference());
	}

}
