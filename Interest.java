//04.	Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class.
import java.util.Scanner;

class Interest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double p= sc.nextDouble();
		double r= sc.nextDouble();
		double t= sc.nextDouble();
		double SI;
		SI=((p*r*t)/100);
		System.out.println("Simple Interest = "+SI);
	}
}