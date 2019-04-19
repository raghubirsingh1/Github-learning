package com.nt.zero;

public class PalindromNumber {
	public static void main(String[] args) {
		int no=121,rem,rev=0;
		int temp=no;
		while(temp!=0){
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==no){
			System.out.println("no is palindrom");
		}else{
			System.out.println("no is not prime");
		}
	}

}
