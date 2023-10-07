package fall2023;
import java.util.Scanner;

public class vowel_switch {
	
	public static void main(String[] args) {
		Scanner check = new Scanner(System.in);
		System.out.println("Enter any character");
		char alphabet = check.next().charAt(0);
		
		switch(alphabet) {
		case 'a' : //first case for 'a'
			System.out.println("It is a vowel sound");
			break;
		case 'e' : 
			System.out.println("It is a vowel sound");
			break;
		case 'i':
			System.out.println("It is a vowel sound");
			break;
		case 'o' :
			System.out.println("It is a vowel sound");
			break;
		case 'u' :
			System.out.println("It is a vowel sound");
			break;
		default: // if the typed character isn't the vowel (a,e,i,o,u)
			System.out.println("It is a consonant");
		}
	}
}	
