package com.nt.nonstatic;

public class Example {
	int a=45;
	int b=65;
	{
		System.out.println("This is non-static block");
	}//non-static
	Example(){
		System.out.println("This is Constructor");
		//Example ex1=new Example();
	}//constructor
	public void m1(){
		System.out.println(a+" "+b);
		int a=10;
		int b=20;
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		System.out.println("This is main");
		Example ex=new Example();
		ex.m1();
	}//main

}//class
