package com.nt.string1;

public class RemoveSpace {
	
	public static void printNumber(int n){
		while(n<=10){
			System.out.println(n);
			printNumber(n+1);
		}
		
	}
	
	
	public static void main(String[] args) {
		printNumber(0);
		/*String str="my self raghubir singh";
		String[] s=str.split(" ");
		String s1="";
		for(int i=0;i<s.length;i++){
			s1=s1+s[i];
		}
		System.out.println(s1);*/
		
		
	}

}
