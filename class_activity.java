package fall2023;
/*
* Student id: 4530393
* Student name: Anmol Singh
* Faculty : Sumithra  
*/
public class class_activity {

	public static void main(String[] args) {
		int a[]= {10, 20, 30, 40};
		String[] car= { "BMW", "Audi", "Lambo"};
		// to fix length 
		int[]z= new int[2];
		z[0]=100;
		z[1]=200;
		System.out.println("the value of z[0] is " + z[0]);

		System.out.println ("the value of a[0] is "+ a[0]);
		System.out.println ("the value of a[3] is "+ a[3]);
		System.out.println ("The car is "+ car[2]);

		// Printing elements 
		for(int i=0; i<a.length ;i++)
		{
			System.out.println("The list of element are "+ a[i]);
		}
		// Reverse element 
		for (int i=3; i>=0;i--)
		{
			System.out.println("The reverse list of element are "+a[i]);
		}
	}
}
	


