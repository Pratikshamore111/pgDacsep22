/*03.	Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class. 
Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.*/


import java.util.Scanner;

class sumPer
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double En = sc.nextDouble();
		double Math = sc.nextDouble();
		double physics = sc.nextDouble();
		double chemistry = sc.nextDouble();
		double Biology = sc.nextDouble();
		double sum;
		double percentage;
		sum = (En + Math + physics + chemistry + Biology);
		percentage = (sum/500)*100;
		System.out.println("percentage marks = "+percentage+" %");
	}
}