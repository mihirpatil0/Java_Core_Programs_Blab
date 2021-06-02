package corejavaprograms;

import java.util.Scanner;

public class PowerOf
{
	void powerOfNum()
	{
		System.out.println("Enter the exponent number:");
		Scanner scanner = new Scanner(System.in);
		double userExponent = scanner.nextDouble();
		double baseTwo = 2;
		System.out.println("The power of 2 is :" + " " + Math.pow(baseTwo, userExponent));
		
	}
	public static void main(String[] args) 
	{
		PowerOf powerof = new PowerOf();
		powerof.powerOfNum();
	}
}
