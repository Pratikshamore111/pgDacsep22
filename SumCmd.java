/*
3.WAP in java to find sum of 2 numbers using command line argument
*/
import java.util.Scanner;

class SumCmd
{
	
public static void main(String args[])
{
int x= Integer.parseInt(args[0]);
int y= Integer.parseInt(args[1]);
int sum;
sum = x+y;
System.out.print("sum using cmd:"+sum);
}
}