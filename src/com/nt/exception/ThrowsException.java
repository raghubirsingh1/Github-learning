package com.nt.exception;

class MyException extends Exception {
	MyException(String s){
		super(s);
	}
}
class ThrowsException {
	static void validAge(int age)throws MyException{
		if(age<18){
			throw new MyException("Not valid to give vote");
		}else{
			System.out.println("welcome to vote");
		}
	}
	public static void main(String[] args) throws MyException {
		validAge(20);
	}
}

