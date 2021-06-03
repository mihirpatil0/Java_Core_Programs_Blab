package corejavaprograms;
import java.util.*;

public class AddToZero 
{
	public static void main(String[] args) 
	{	
		System.out.println("Finding Sum of any three integers zero.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers you want to store : Minimum 3 numbers");
		int arrayLegth = sc.nextInt();
		int[] arrStoreNo = new int[arrayLegth];
		
		for(int i=0; i<arrStoreNo.length; i++)
		{
			System.out.println("Enter any positive or negative numbers");
			int userInput = sc.nextInt();
			arrStoreNo[i] = userInput;
		}
		for(int j=0; j<arrStoreNo.length; j++)
		{
			System.out.println("Values are : " + " " + arrStoreNo[j]);
		}
		for(int a=0; a<arrStoreNo.length-2; a++) 
		{
			for(int b=1; b<arrStoreNo.length-1; b++)
			{
				for(int c=2; c<arrStoreNo.length; c++)
				{
					if(arrStoreNo[a]+arrStoreNo[b]+arrStoreNo[c] == 0)
					{
						System.out.println("The sume of 3 integer" + " " + arrStoreNo[a]+"+"+arrStoreNo[b]+"+"+arrStoreNo[c] + " = 0");
					}
				}
			}
		}
	}
}
