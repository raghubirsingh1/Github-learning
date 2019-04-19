package com.nt.string;

import java.util.Scanner;

public class Febonacii {
	
	public static void main(String[] args) {
		int a=0,b=1,c,no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++){
			System.out.print(" "+a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
