package corejavaprograms;
import java.util.*;

public class SwapTwoNumbers 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int firstNumber = sc.nextInt();
		System.out.println("Enter Second Number");
		int secondNumber = sc.nextInt();
		System.err.println("Before swapping numbers : " + " " + "Number One : " + firstNumber + " " + "Number Two : " + " " + secondNumber);
		firstNumber += secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		System.out.println("After swapping numbers : " + " " + "Number One : " + firstNumber + " " + "Number Two : " + " " + secondNumber);
	}
}
