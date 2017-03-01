
public class Rectangle {
public final double width;double length;
public Rectangle(double width,double length)
{
	this.width=width;
	this.length=length;
}
public void findArea(){
	System.out.println("The Area of the Rectangle is:");
}
public void findPerimeter(){
	System.out.println("The Perimeter of the Rectangle is:");
}
public double findarea(){
	return width*length;
}
public double findperimeter(){
	return 2*(width+length);
	
}
	
	public static void main(String[] args) {
		

	}

}
