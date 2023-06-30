package commm.java;

import java.util.Scanner;

public class FactorailOfNumber {

	public static void main(String[]args)
	{
		int fact=1;
		
		System.out.println("please enter the number if you want to find the factorial of that"
				+ "number");
		
		 Scanner ok=new Scanner(System.in);
		  
		 int x=ok.nextInt();
		 
		 
		 for(int m=1;m<x;m++)
		 {	
			  fact=m*x;
			 
		 }
			 
			 System.out.println("Factorail of given number is "+fact);
			 
		 }
		 
		
		
	}
	

