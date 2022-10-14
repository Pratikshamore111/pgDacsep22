/*
1. Demonstration of creating a class

property/data/state
behivour/methods/functions
instance/object


Student class
Data - int roll, String name, double marks;
Method - printDetails, changeMarks, addDetails;

class is a combination of data and methods which operate over those data.
*/

import java.util.Scanner;

class Student
{
	
	int rollNum;
	String name;
	double marks;
	
	
	
	 void addDetails(int rollNum, String name, double marks)
	{
		
		this.rollNum=rollNum;
		this.name=name;
		this.marks=marks;
		
	}
	void changeMarks( double mark)
	{
		
		
		this.marks=mark;

		
	}
	
	void printDetails()
	{
		System.out.println("student rollnumber : "+this.rollNum);
		System.out.println("student name :"+this.name);
		System.out.println("students marks :"+this.marks);
	}
	
	public static void main(String args[])
	{
		Student s1= new Student();
	    s1.addDetails(1, "Pratiksha", 75.00);
		s1.changeMarks(77);
		s1.printDetails();
		Student s2= new Student();
		s2.addDetails(2, "Pratiksha", 80.00);
		s2.printDetails();
		
	
		
		
		
	}
	
}