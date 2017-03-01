
public class ShapeTest {

	
	public static void main(String[] args) {
		double radius=5;
		double width=10;double length=12;
		double a=10,b=20,c=30;
		Circle circle=new Circle(radius);
		Rectangle rectangle=new Rectangle(width,length);
		Triangle triangle=new Triangle(a,b,c);
		System.out.println("Circle Radius :"+radius);
		circle.findArea();
		System.out.println(circle.findarea());
		circle.findPerimeter();
		System.out.println(circle.findperimeter());
		System.out.println("............................................................");
		System.out.println("Rectangle Width And Length :"+width+ " and"+length);
		rectangle.findArea();
		System.out.println(rectangle.findarea());
		rectangle.findPerimeter();
		System.out.println(rectangle.findperimeter());
		System.out.println("............................................................");
		System.out.println("Triangle Sides :"+a+ ","+b+" and"+c);
		triangle.findArea();
		System.out.println(triangle.findarea());
		triangle.findPerimeter();
		System.out.println(triangle.findperimeter());

	}

}
