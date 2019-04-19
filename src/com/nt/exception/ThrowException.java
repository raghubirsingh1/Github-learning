package com.nt.exception;

public class ThrowException {
	public static void validAge(int age){
		if(age<18){
			throw new ArithmeticException("not valid to give vote");
		}else{
			System.out.println("Welcome to valid vote");
		}
	}
	public static void main(String[] args) {
		try{
		validAge(19);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
