package com.nt.thread;

public class PrintNumber {
	
	public static void printNumber(int n){
		if(n<=10){
			System.out.println(n);
			printNumber(n+1);
			
		}
	}
	public static void main(String[] args) {
		printNumber(0);
	}

}
