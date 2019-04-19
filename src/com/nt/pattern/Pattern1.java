package com.nt.pattern;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++){
			for(int j=5;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print("*");
			}
			for(int l=1;l<=i;l++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
