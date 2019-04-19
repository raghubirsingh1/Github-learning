package com.nt.exception;


public class Test {
	public static void main(String[] args) {
		
		try{
			System.out.println(10/0);
		}catch(ArithmeticException e){
			System.out.println(10/2);
		}
		catch(Exception e1){
			System.out.println(10/2);
		}
		finally {
			
			System.out.println("finally");
		}
		
	}

}
