package oops.io;
class shape{
String var="Shape";
public double area() {
		
		return(0.0);
	}
}
class circle extends shape{
	String var="Circle";
	int r=30;
	public double area(){
		return(3.14*r*r);
	}
}
class rectangle extends shape{
	double a=10,b=20;
	public double area(){
	return(a*b);
	}
}
class triangle extends shape{
	double b=30,h=40;
	public double area(){
	return(0.5*b*h);
	}
}
public class TestShape {
	public static void main(String s[]) {
	shape s1=new circle();//reference type
	System.out.println(s1.var);
	double area=s1.area();
	System.out.println("The area of the circle is "+ area);
	
	shape s2=new triangle();
	area=s2.area();
	System.out.println("The area of the triangle is "+ area);
	shape s3=new rectangle();
	area=s3.area();
	System.out.println("The area of the rectangle is "+ area);
	
}}
