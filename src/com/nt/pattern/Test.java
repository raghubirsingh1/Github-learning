package com.nt.pattern;

public class Test {
	
	private static Test t=new Test();
	 
	private Test(){
		
	}
	public static Test getTest(){
		return t;
	}
	public static void main(String[] args) {
		Test t1=new Test();
	}
}

