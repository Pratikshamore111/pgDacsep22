/*
WAP in java to find Factorial of a number using command line argument
*/
import java.util.Scanner;
class Factorial
{
     static int fact=1;
	static void printFactorial(int n){
		
	
	
		if(n>0)
		{
		fact=fact*n;
	
		printFactorial(n-1);
		}
		
		
	}
	public static void main(String args[])
	
	{
	   int n=Integer.parseInt(args[0]);
		
		printFactorial(n);
		System.out.println("Factorial of number:"+fact);
	}
	
	
}	