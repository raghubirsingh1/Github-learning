package com.nt.string;

public class ReverseStrnig {
	
	public static void main(String[] args) {
		String str="raghubir";
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
	}

}
