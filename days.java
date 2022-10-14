//05.	Write a program to read the days (eg. 670 days) as integer value using Scanner class. Now convert the entered days into complete years, months and days and print them.
import java.util.Scanner;

class days
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the days");
		int nod = sc.nextInt();
		int year;
		int month;
		int day;

		year = (nod/365);
		month = ((nod-365)/30);
		day = ((nod-365)%30);
		
		System.out.println("Year = "+year+" Month ="+month+" days ="+day);
		
		
	}
}