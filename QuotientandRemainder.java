package corejavaprograms;
import java.util.Scanner;

public class QuotientandRemainder 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find quotient and remainder");
		int userNumber = sc.nextInt();
		for(int i=1; i<=userNumber; i++) 
		{
			int quotient = userNumber/i;
			int remainder = userNumber%i;
			System.out.println("For:" + " " + userNumber + "/" + i + " Quotient is = " + " " + quotient + " Remainder is = " + remainder);
		}
	}
}
