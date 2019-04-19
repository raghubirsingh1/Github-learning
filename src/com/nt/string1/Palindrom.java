package com.nt.string1;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		String s1="";
		for(int i=ch.length-1;i>=0;i--){
			s1=s1+ch[i];
		}
		if(s.equals(s1)){
			System.out.println("String is palindrom");
		}else{
			System.out.println("String is not palindrom");
		}
	}

}
