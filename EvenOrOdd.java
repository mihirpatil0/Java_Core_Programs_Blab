package corejavaprograms;
import java.util.*;

public class EvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check even or odd");
		int userNumber = sc.nextInt();
		if(userNumber%2 == 0)
		{
			System.out.println("The given number : " + userNumber + " " + "is a even number.");
		}
		else
		{
			System.out.println("The given number : " + userNumber + " " + "is a odd number.");
		}
	}
}
