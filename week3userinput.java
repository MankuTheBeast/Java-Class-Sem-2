package fall2023;
import java.util.Scanner; // Module Name

public class week3userinput {

	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = y.nextInt();
		System.out.println("The value of a is " + a);
		System.out.println("Enter value of b");
		int b = y.nextInt();
		int c = a + b;
		System.out.println("The value of b is " + b);
		System.out.println("The addition of " + a + " and " + b + " is " + c);
		
		Scanner z = new Scanner(System.in);
		System.out.println("Enter your name");
		String x = z.nextLine();
		System.out.println("Welcome " + x);
	}

}
