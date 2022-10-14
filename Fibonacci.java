/*
4.WAP in java to display Fibonacci series using command line argument

*/
import java.util.Scanner;

class Fibonacci
{
	static int n1=1, n2=1, n3;
	static void fibonacci(int count)
	{
		if(count>0)
		{
			n3=n1+n2;
			
			System.out.print(n3+" ");
			
			n1=n2;
			n2=n3;
			fibonacci(count-1);
		}
		
			
	}
	
	public static void main(String args[])
	{
		
		int count=Integer.parseInt(args[0]);
		System.out.println(" Fibonacci series upto "+count+" is:");
		System.out.print(n1+" "+n2+" ");
	    fibonacci(count-2);
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	