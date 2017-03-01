
public class Triangle {
public double a,b,c;
public Triangle(double a,double b,double c)
{
	this.a=a;
	this.b=b;
	this.c=c;
}
public void findArea(){
	System.out.println("The Area of the Triangle is:");
}
public void findPerimeter(){
	System.out.println("The Perimeter of the Triangle is:");
	
}
public double findarea(){
 double s=a+b+c/2;
 return Math.sqrt(s*(s-a)*(s-b)*(s-c));
}
public double findperimeter(){
	return a+b+c;
	
}


	
	public static void main(String[] args) {
		

	}

}
