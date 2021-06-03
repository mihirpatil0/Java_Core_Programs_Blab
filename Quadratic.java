package corejavaprograms;

import java.util.Scanner;

public class Quadratic
{
	public static void main(String[] args)
	{
		System.out.println("Calculating Quadratic Roots of Equation");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of 'a' in Qudratic equation:");
		int a=sc.nextInt();
		System.out.println("Enter the value of 'b' in Qudratic equation:");
		int b=sc.nextInt();
		System.out.println("Enter the value of 'c' in Qudratic equation:");
		int c=sc.nextInt();
		System.out.println("The roots of the equation "+a+"x^2+"+b+"x+"+c+" are ");
		quadraticRoots(a,b,c);
	}
	public static void quadraticRoots(int a,int b,int c)
	{
		int Delta = b*b-4*a*c;
		if (Delta>=0)
		{	
			float Root1= (float) (-b+Math.sqrt(Delta))/(2*a);
			float Root2= (float) (-b-Math.sqrt(Delta))/(2*a);
			System.out.println("Root 1: "+Root1+" & Root 2: "+Root2);
		}
		else
		{
			System.out.println("Imaginary, Since Delta is <0");
		}
	}
}
