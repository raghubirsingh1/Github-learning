package com.nt.mind;

public class Anagram {
	public static void main(String[] args) {
		String str="java";
		String str1="avja";
		int string1=0;
		int string2=0;
		char[] ch=str.toCharArray();
		char[] ch1=str1.toCharArray();
		if(ch.length==ch1.length){
			for(int i=0;i<ch.length;i++){
				string1=string1+ch[i];
				string2=string2+ch1[i];
			}
			System.out.println(string1==string2);
		}
		System.out.println(false);
	}

}
