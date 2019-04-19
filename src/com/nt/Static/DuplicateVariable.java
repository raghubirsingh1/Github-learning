package com.nt.Static;

public class DuplicateVariable {
	
	static int a=m1();
	
	static int m1(){
		System.out.println("variable a is created");
		return 10;
	}
		
	static int m2(){
		System.out.println("variable b is created");
		return 20;
	}

	public static void main(String[] args) {
		System.out.println("main");
		System.out.println("a:"+a);
		System.out.println("b:"+b);	
		m1();
		m2();
	}
	
	static int b=m2();

	static {
		System.out.println("static block");
	}
	
}
