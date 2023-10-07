package fall2023; // Java Package declaration
import java.util.Scanner; // Adding a package in the code so that to take input from the user

// Student Id: 4530393
// Student Name: Anmol Singh

public class gradecalc {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in); // Object Declaration
		char grade; // Declaring variable 'grade' as a char
		
		System.out.print("Enter Your percentage: ");
		int percentage = scan.nextInt(); // Asking for input from student and storing it as integer
		if(percentage>=100) {
			System.out.print("Invalid Input, Enter a percentage between 0 to 100");
		} else if (percentage < 0) {
			System.out.print("Invalid Input, Enter a percentage between 0 to 100");	
		} else  if(percentage >=90) {
			grade = 'A';
			System.out.println("Your Grade is " + grade);
		} else if(percentage>=80) {
			grade = 'B';
			System.out.println("Your Grade is " + grade);
		} else if(percentage>=70) {
			grade = 'C';
			System.out.println("Your Grade is " + grade);
		} else if(percentage>=60) {
			grade = 'D';
			System.out.println("Your Grade is " + grade);
		} else {
			grade = 'F';
			System.out.println("Your Grade is " + grade);
		}
	}
}