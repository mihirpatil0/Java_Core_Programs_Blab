package corejavaprograms;

import java.util.Scanner;

public class LeapYear 
{	
	void isLeapYear()
	{
		System.out.println("Enter year only:");
		Scanner scanner = new Scanner(System.in);
		int userYear = scanner.nextInt();
		if(userYear % 4 == 0 && (userYear % 100 != 0 || userYear % 400 == 0))
		{
			System.out.println(userYear + " " + "It is leap year.");
		}	
		else
		{
			System.out.println(userYear + " " + "It is not a leap year.");
		}
	}
	public static void main(String[] args)
	{
		LeapYear leapyear = new LeapYear();
		leapyear.isLeapYear();
	}
}
