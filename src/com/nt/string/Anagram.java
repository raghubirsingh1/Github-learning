package com.nt.string;

public class Anagram {
	
	public static void main(String[] args) {
		String str1="java";
		String str2="jvaa";
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		int string1=0;
		int string2=0;
		if(ch1.length==ch2.length){
		for(int i=0;i<ch1.length;i++){
				string1=string1+ch1[i];
				string2=string2+ch2[i];
			}
		System.out.println(string1==string2);
		}
		System.out.println(false);
	}

}
