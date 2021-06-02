package corejavaprograms;

import java.util.Scanner;

public class PrimeFactor 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to find its prime factors:");
		int userNumber = scanner.nextInt();
		for(int i=2; i<=userNumber; i++)
		{
			while(userNumber%i == 0)
			{
				System.out.println(i);
				userNumber = userNumber/i;
			}
		}
	}
}
