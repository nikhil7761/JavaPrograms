package com.problem.java;

import java.util.Scanner;

public class ExceptionProblem {

	 public static void main(String[]args)
	 {
		 System.out.println("please enter your age");
		 Scanner p=new Scanner(System.in);
		 int x=p.nextInt();
		 Validate(x);
		 System.out.println("Please wait.....");
	 }
	
	 static void Validate(int age) {
		 if(age<18)
			 throw new ArithmeticException("You are not vaild for election");
		 else
			 System.out.println("Please enter button you want to vote them");
	 }
	
	
}
