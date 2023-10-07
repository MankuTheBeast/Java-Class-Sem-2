package fall2023;

public class week5 {

	/* 
	   Student ID: 4530393
	   Student Name: Anmol Singh
	   Faculty: Sumithra
	*/
 

      public void sum(int a,int b)
      {
           int s = 0;
           for(int i=a; i<=b; i++)
           {
                s += i;
           }
           
           System.out.println("The value of s is (Sum from " + a + " to " + b + ") is " + s);
           }
      
           static void display()
           {
                System.out.println("Hey There");
           }
           
           public static int total (int num1,int num2)
           {
                int sum=0;
                for(int i = num1; i <= num2; i++)
                {
                      sum += 1;
                }
                
                return sum;
           }

           public void addition(int a, int b)
           {
                int c = a + b;
                System.out.println("The addition of a and b is "+c);
           }
           
           public void addition(int a, int b, int c)
           {
                int d = a + b + c;
                System.out.println("The value of d is " +d);
           }

           public static void main(String[]args)
           {
                week5 object =new week5();
                object.display();
                object.sum(15,20);
                object.addition(15,20);
           }
      }