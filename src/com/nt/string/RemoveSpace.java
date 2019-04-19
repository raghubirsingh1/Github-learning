package com.nt.string;

public class RemoveSpace {
	public static void main(String[] args) {
		String str1="hello how are you";
		String str2="";
		String[] ch=str1.split(" ");
		for(int i=0;i<ch.length;i++){
			str2=str2+ch[i];
		}
		System.out.println(str2);
	}
}
