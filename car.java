package fall2023;

public class car {

	public void Toyota(String make, String Model, int year) {
		System.out.println("car make is " + make);
		System.out.println("car model is " + Model);
		System.out.println("car year is " + year);
	}
	
	public static void main(String[] args) {
		car y = new car();
		y.Toyota("AML", "Ford", 2023);
		y.Toyota("XML", "Tesla", 2069);
	}

}
