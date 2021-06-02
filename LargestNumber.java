package corejavaprograms;
import java.util.*;

public class LargestNumber
{
	public static void main(String[] args)
	{
		int temp,largest;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int numberOner = sc.nextInt();
		System.out.println("Enter second number");
		int numberTwo = sc.nextInt();
		System.out.println("Enter third number");
		int numberThree = sc.nextInt();
		
		temp = numberOner>numberTwo?numberOner:numberTwo;
		largest = temp>numberThree?temp:numberThree;
		System.out.println("The largest number amoung : " + " " + numberOner + ", " + numberTwo + ", " + numberThree + " is" + " " + largest);
	}
}
