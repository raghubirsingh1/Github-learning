package com.nt.exception;

public class Test2 {
	public static void main(String[] args) {
		try{
			System.out.println("try block");
			System.out.println(10/0);
		}catch(NullPointerException n){
			System.out.println("catch block");
		}finally {
			System.out.println("Finally block");
		}
	}

}
