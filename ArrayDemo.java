package week5.exercises;

import java.util.Scanner;

public class ArrayDemo {
	public void arrOfAge()
	{
		Scanner inputFromUser = new Scanner(System.in);
		
		int arr[] = new int[5];
		int summation = 0 ;
		int avg = 0;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print("Enter age " +(i+1)+ " : ");
			arr[i] = inputFromUser.nextInt();
		}
		
		System.out.print("The age you entered : ");
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(" " +arr[i]);
		}
		
		arr[2] = 24;
		System.out.print("\nThe age after edit : ");
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(" " +arr[i]);
			summation = summation + arr[i];
		}
		avg = summation/arr.length;
		System.out.print("\nThe average age : " +avg);
		
	}
	
	public void arrOfName()
	{
		Scanner inputFromUser = new Scanner(System.in);
		Scanner inputFromUserString = new Scanner(System.in);
		
		int x;

		System.out.print("\nHow many names you want to enter : ");
		x = inputFromUser.nextInt();
		
		String name[] = new String[x];
		
		System.out.println("Enter top " +x+ " names of the player in bd cricket team : ");
		for(int i = 0 ; i < x ; i++ )
		{
			System.out.print("\nEnter name " +(i+1)+ " : ");
			name[i] = inputFromUserString.nextLine();
		}
		
		System.out.println("The top of " +x+ "names you entered are : ");
		for(int i = 0 ; i < x ; i++)
		{
			System.out.print(name[i]+ ", ");
		}
	}
	
	public void arrySum()
	{
		int[] values = { 5, 5, 5, 5, 10, 10, 20, 20 };
		int sum = 0;
		
		for(int i = 0 ; i < values.length ; i++) sum += values[i];
	}
	
	public void arrOfCgpa()
	{
		Scanner inputFromUser = new Scanner(System.in);
		
		double arr[][] = new double[2][2];
		
		for(int i = 0; i<arr.length ; i++ )
		{
			for(int j = 0; j<arr.length ; j++ ) {
				
			System.out.print("\nEnter cgpa of student " +(i+1)+ " semester "+(j+1)+ " : " );
			arr[i][j] = inputFromUser.nextDouble();
			
			}
		}
		
		for(int i = 0; i<arr.length ; i++ )
		{
			for(int j = 0; j<arr.length ; j++ ) {
			System.out.print(arr[i][j]+" ");
			
			
			
			
			}
			System.out.print("\n");
		}
	}

}
