package com.nt.string1;

public class Factorial {
	public static int findFact(int n){
		if(n==0){
			return 1;
		}else{
			return (n*(findFact(n-1)));
		}
	}
	
	
	public static void main(String[] args) {
		int fact=1,num=5;
		fact=findFact(num);
		System.out.println(fact);
	}

}
