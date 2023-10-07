package fall2023;

public class week3 {
	
	public void increment() {
		int a, b;
		b = 90; 
		
		a = ++b; // b = b + 1 and then a = b
		System.out.println("The value of a is " + a + " and the value of b is " + b);
		
		a = b++; // a = b and then b = b + 1
		System.out.println("The value of a is " + a + " and the value of b is " + b);
	}

	
	
	public static void main(String[] args) {
		week3 i = new week3();
		i.increment();

	}

}
