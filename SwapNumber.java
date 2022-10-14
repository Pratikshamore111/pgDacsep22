/*
1. Swap two numbers
2. Find max and min number
3. Find the factorial
4. Print prime number
5. Check armstrong number
6. Get random number
7. Convert binary to decimal
8. Print Pascals triangle
9. Palindrome number
10. Reverse the number
11. Print Fibonacci series
12. Demonstrate type of variable
13. Count even, odd and zeroes

*/
//1. Swap two numbers

import java.util.Scanner;

class SwapNumber
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		int temp;
		System.out.println("Numers before swapping: "+x+"and"+y);
		
		x=temp;
		x=y;
		y=temp;
		
		System.out.println("Numbers after Swapping: "+x+"and"+y);
		
	}
}

		