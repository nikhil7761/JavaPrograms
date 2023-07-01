package com.problem.java;

import java.util.Scanner;

public class ReverseWithLogic {

	
	public static void main(String[]args)
	{
		
		String Original,reverse="";
		Scanner o=new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		Original=o.nextLine();
		
		int length=Original.length();
		
		for(int i=length-1;i>=0;i--) 
		{
		  reverse=reverse+Original.charAt(i);	
			
		}
		
		System.out.println("reverse string is:"+reverse);
		
	}
	
}
