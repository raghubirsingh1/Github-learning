package com.nt.thread;

public class PalindromNO {
	public static void main(String[] args) {
		int no=151,rev=0,rem;
		int temp=no;
		while(temp!=0){
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev){
			System.out.println("no is palindrom");
		}else{
			System.out.println("no is not palindrom");
		}
	}

}
