package com.nt.exception;

public class Test6 {
	public static void main(String[] args) {
		String str="ab}{cde()ido][";
		String str1="";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			int k=ch[i];
			if((k>64 && k<91)||(k>96 && k<123)){
				str1=str1+ch[i];
			}
		}
		System.out.println(str1);
	}
}
