package com.nt.Static;

public class Example {
	static int a=10;
	static int b=20;
	static{
		
		System.out.println("This is static block");
	}//static
	public Example(){
		System.out.println("This is Constructor block");
	}//constructor
	public static void m1(){
		
		System.out.println("This is static method");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}//method
	public static void main(String[] args) {
		System.out.println("This is main method");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		m1();
		//Example ex=new Example();
	}//main
}//class
