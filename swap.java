//07.	Write a program to swap two numbers without using third variable.
import java.util.Scanner;

class swap
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before swapping : "+a+"and"+b);
		a= a + b;
		b= a - b;
		a= a - b;
		System.out.println("After Swapping : "+a+"and"+b);
	}
}