package corejavaprograms;

import java.util.Scanner;

public class EuclideanDistance 
{
	public static void main(String[] args)
	{
		System.out.println("Calculating Euclidean Distance");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x point:");
		int x=sc.nextInt();
		System.out.println("enter the value of y point:");
		int y=sc.nextInt();
		findEuclideandistance(x,y);
	}
	public static void findEuclideandistance(int x,int y)
	{
		float distance=(float) Math.sqrt((x*x)+(y*y));
		System.out.println("Euclidean Distance of ("+x+","+y+") is "+distance);
	}
}
