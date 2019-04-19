package com.nt.exception;

public class Test4 {

	public static void main(String[] args) {
		try{
			System.out.println("try block");
			return;
		}catch(ArithmeticException a){
			System.out.println("catch block");
		}finally{
			System.out.println("finally block");
		}
	}
}
