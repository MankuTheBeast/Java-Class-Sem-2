package fall2023; // Java Package declaration
import java.util.Scanner; // Adding a package in the code so that to take input from the user

public class gradecheck { // Class named 'gradecheck' defined at public visibility

	public static void main(String[] args) {
		Scanner gr = new Scanner(System.in); // Object Scanner declaration for user input named 'gr'
		System.out.println("Please enter your marks : "); // Display message
		int marks = gr.nextInt(); // Read integer from user and store in marks variable
		System.out.println("Your grade is : "); // Display message
		char gradeAcquired; 
		
		if (marks >= 90)
		{
			gradeAcquired = 'A';
			System.out.println(gradeAcquired + " : " + "90% and above");
		}
		else if (marks >=80)
		{
			gradeAcquired = 'B';
			System.out.println(gradeAcquired + " : " + "80% - 89%");
		}
		else if (marks >= 70)
		{
			gradeAcquired = 'C';
			System.out.println(gradeAcquired + " : " + "70% - 79%");
		}
		else if (marks >= 60)
		{
			gradeAcquired = 'D';
			System.out.println(gradeAcquired + " : " + "60% - 69%");
		}
		else
		{
			gradeAcquired = 'F';
			System.out.println(gradeAcquired + " : " + "Below 60%");
		}
	}
}