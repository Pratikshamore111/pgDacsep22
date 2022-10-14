//06.	Write a program to convert temperature from Fahrenheit to Celsius. Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]
import java.util.Scanner;


class temp
{
	public static void main(String args[])
	{
		
	Scanner sc = new Scanner(System.in);
	int fr= sc.nextInt();
	int Ce;
	Ce = ((5*(fr-32))/9);
	System.out.println("temprature from Fehrenheit to Celcius :"+Ce);
	}
}