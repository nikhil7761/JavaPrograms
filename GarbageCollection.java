package com.problem.java;

public class GarbageCollection {
	
	
	public static void main(String[]args)
	{
		
		Runtime rs=Runtime.getRuntime();
		System.out.println("Free memory in jvm before garbage Collection:"+rs.freeMemory());
		rs.gc();
		System.out.println("Free memory  in jvm after garbage Collection:"+rs.freeMemory());
		
		
	}

}
