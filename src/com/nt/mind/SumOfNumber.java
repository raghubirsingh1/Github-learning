package com.nt.mind;

public class SumOfNumber {
	public static void main(String[] args) {
		int no=12345,sum=0,rem;
		while(no!=0){
			rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println(sum);
	}

}
