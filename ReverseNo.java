package commm.java;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[]args) {
		
		int n,Reverse=0;
		
		System.out.println("please enter the number if you want that number will be reverse");
		
	    Scanner p=new Scanner(System.in);
	    
	     n=p.nextInt();
	    
	    while(n!=0)
	    {
	    	Reverse=Reverse*10;
	    	Reverse=Reverse+n%10;
	    	n=n/10;
	    	
	    }
	    
	    System.out.println("Reversed Enter number"+Reverse);
		
		
	}
	
	
}
