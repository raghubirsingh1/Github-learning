package com.nt.zero;

public class RemoveSpace {

	public static void main(String[] args) {
		String str="raja is a good";
		String s1="";
		String[] str1=str.split(" ");
		for(int i=0;i<str1.length;i++){
			s1=s1+str1[i];
		}
		System.out.println(s1);
	}
}
