package com.nt.thread;

public class PrimeNumber {
	public static void main(String[] args) {
		int no=7, temp=0;
		for(int i=2;i<=no-1;i++){
			if(no%i==0){
				temp=temp+1;
			}
		}
		if(temp==0){
			System.out.println("number is prime");
		}else{
			System.out.println("number is not prime");
		}
	}

}
