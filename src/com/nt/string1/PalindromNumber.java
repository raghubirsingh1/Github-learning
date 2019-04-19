package com.nt.string1;

import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		int temp=n;
		int rev=0,rem;
		if(temp!=0){
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/n;
		}
		if(temp==rev){
			System.out.println("number is palindrom");
		}else{
			System.out.println("number is not palindrom");
		}
	}

}
