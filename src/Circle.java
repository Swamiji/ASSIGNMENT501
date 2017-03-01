
public class Circle extends Shape {
private final double radius;
final double pi=Math.PI;
public Circle(double radius){
	this.radius=radius;
}

public void findArea(){
	System.out.println("The Area of the Circle is:");
	
}
public double findarea(){
	return pi*Math.pow(radius, 2);
}
public void findPerimeter(){
	
	System.out.println("The Perimeter of the Circle is:");
}
public double findperimeter(){
	return 2*pi*radius;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
