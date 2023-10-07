package fall2023;

public class functions {
	
	
	public void addition() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("The addition is "+ c);
	}
	
	public void multiply() {
		int a = 10;
		int b = 20;
		int c = a*b;
		System.out.println("The multiplication is " + c);
	}
	
	public static void main(String[] args) {
		functions r = new functions();
		r.addition();
		r.multiply();
	}

}
