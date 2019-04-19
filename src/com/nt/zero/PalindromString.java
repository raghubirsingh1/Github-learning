package com.nt.zero;

public class PalindromString {
	public static void main(String[] args) {

	String str="Bob";
	String str1="";
	char[] ch=str.toCharArray();
	for(int i=ch.length-1;i>=0;i--){
		str1=str1+ch[i];
	}
	if(str.equals(str1)){
		System.out.println("no is palindrom");
	}else{
		System.out.println("no is not palindrom");
	}
	}
}
