package com.nt.string1;

public class SumOfNumber {
	public static void main(String[] args) {
		int no=1234,sum=0,rem;
		while(no>0){
			rem=no%10;
			sum=sum+rem;
			no=no/10;
			
		}
		System.out.println(sum);
	}

}
