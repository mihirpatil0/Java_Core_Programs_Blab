package corejavaprograms;

import java.util.Scanner;

public class TwoDArray
{
	public static void main(String[] args) 
	{
		System.out.println("Creating a 2 Dimensional array");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of Rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter the no.of Columns: ");
		int colum=sc.nextInt();
		printTwoDArray(rows,colum);
	}	
	public static void printTwoDArray(int rows,int colum) 
	{
		int[][] arr = new int [rows][colum];
		int k=1;
		for(int i=0; i < rows; i++)
		{
			for(int j=0; j < colum; j++)
			{
				arr[i][j]=k;
				System.out.print("arr[" + i + "][" + j + "]="+ arr[i][j] + "  ");
				k++;
			}
			System.out.println();
		}
	}
}
