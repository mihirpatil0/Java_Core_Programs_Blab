package corejavaprograms;

import java.util.Scanner;

public class CoinFlip 
{
	void flipPercentage()
	{
		System.out.println("Enter number, How many times you want to flip a coin :");
		Scanner scanner = new Scanner(System.in);
		int coinUserInput = scanner.nextInt();
		
		int countHead = 0, countTail = 0;
		double percentageHead, percentageTail;
		
		for(int i=1; i<=coinUserInput; i++)
		{	
			double randomCoinFlip = Math.random();
			if(randomCoinFlip < 0.5)
			{	
				countTail++;
				System.out.println("Tail it is." + " " + randomCoinFlip);
			}
			else
			{	
				countHead++;
				System.out.println("Head it is." + " " + randomCoinFlip);
			}
		}
		System.out.println("Count of Head is :" + " " + countHead + " " + "and Tail is :" + " " + countTail);
		percentageHead = ((countHead*100)/coinUserInput);
		System.out.println("The percentahe of head appearance is :" + percentageHead + " " + "%");
		percentageTail = ((countTail*100)/coinUserInput);
		System.out.println("The percentahe of tail appearance is :" + percentageTail + " " + "%");
		
	}
	public static void main(String[] args) 
	{
		CoinFlip coinflip = new CoinFlip();
		coinflip.flipPercentage();
	}
}
