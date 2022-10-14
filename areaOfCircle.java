//02.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. Then calculate and print the area and circumference of the circle.
import java.util.Scanner;

class areaOfCircle
{
	
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		double radius=s.nextDouble();
		double area;
		area = 2*3.14*radius;
		System.out.println("Area of circle:"+area);
		
		
		
	}
}

		