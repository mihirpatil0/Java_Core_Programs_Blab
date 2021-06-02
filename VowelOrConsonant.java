package corejavaprograms;
import java.util.*;

public class VowelOrConsonant
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet");
		String userInput = sc.next();
		switch (userInput)
		{
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println(userInput + " is vowel.");
				break;
		default:
			System.out.println(userInput + " is consonant.");
		}
	}
}
