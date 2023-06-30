package com.java;

import java.util.Scanner;

public class Largestno {
	
	public static void main(String[]args){
		
		
		System.out.println("please enter 3 values");
		
		Scanner s=new Scanner(System.in);
	
		
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		
		if(x>y&&x>z)
			System.out.println("x number is greater than y and z");
		else if(y>x&&y>z)
		    System.out.println("y number is greater than x and z");
		else if(z>x&&z>y)
            System.out.println("z number is greater than x and y");		
		else
			System.out.println("please enter correct input");
	
		
	}
	

}
