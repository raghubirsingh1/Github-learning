package com.nt.string1;

public class PrimeNumber {
	public static void main(String[] args) {
		int no=7,temp=0;
		for(int i=2;i<no-1;i++){
			if(i%2==0){
				temp=temp+1;
			}
		}
		if(temp==no){
			System.out.println("no is prime");
		}else{
			System.out.println("no is not prime");
		}
	}

}
