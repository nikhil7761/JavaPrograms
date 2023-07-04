package com.problem.java;

import java.util.Scanner;

public class Swap2With3 {
	
	public static void main(String[]args)
	{
	int temp;
	System.out.println("Enter 3 Integer");
	Scanner q=new Scanner(System.in);
		int x=q.nextInt();
		int y=q.nextInt();
		
	System.out.println("Before swping_"+"x:"+x+"_y:"+y);	
		
		temp=x;
		x=y;
		temp=y;
		
	System.out.println("After swping_"+"x:"+x+"_y:"+y);
		
			
	}
	

}
