package com.nt.exception;

public class Test3 {
	public static void main(String[] args) {
		try{
			System.out.println("try block");
			System.out.println(10/0);
			
		}catch(ArithmeticException a){
			System.out.println("catch block");
		}finally {
			System.out.println("finally block");
		}
	}

}
