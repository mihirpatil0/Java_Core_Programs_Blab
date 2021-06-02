package corejavaprograms;

import java.util.Scanner;

public class NthHarmonic
{
	public static void main(String[] args) 
	{
		double harmonic = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to find harmonic value:");
		int userInput = scanner.nextInt();
		for(int i=1; i<=userInput; i++)
		{
			harmonic += (double) 1/i ;
			System.out.println("Harmonic " + i + ": " + harmonic);
		}
		
	}
}
