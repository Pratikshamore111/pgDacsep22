/*
7.WAP to accept percentage and display the class in which category it is First Class, Second Class, Fail, Distinction
*/
import java.util.Scanner;

class DisplayClass
{
	public static void main(String args[])
	{
		int marks;
		Scanner sc= new Scanner(System.in);
		float per=sc.nextFloat();
		
	  if(per<40)
	  {
		  System.out.println("Fail");
	  }
	  else if(per<75)
	  {
	  
		  System.out.println("Pass");
	  }
	  else if(per>=75&& per<80)
	  {
	  System.out.println("Second Class");
	  }
	  else
	  {
		  System.out.println("First Class");
	  }
    }
}
		  
		
	
	