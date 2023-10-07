package fall2023;

public class Circle {
	
//	public void area() {
//		double x = 3.14;
//		int radius = 20;
//		
//		double area = x*radius*radius;
//		System.out.println("The area of the circle is " + area);
//	}
//
//	public static void main(String[] args) {
//		Circle i = new Circle(); //allocation of memory
//		i.area();
//	}

	public void perimeter() {
		double pi = 3.14;
		double r = 4;
		double perimeter = 2 * pi * r;
		
		System.out.println("The perimeter of the circe with " + r + " radius is " + perimeter);
	}
	
	public static void main(String[] args) {
	Circle i = new Circle();
	i.perimeter();
	
	}
}
