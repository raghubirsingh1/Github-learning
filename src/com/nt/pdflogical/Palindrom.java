package com.nt.pdflogical;

public class Palindrom {
	public static void main(String[] args) {
		
		String str1="malylam";
		String str2="";
		char[] ch=str1.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			str2=str2+ch[i];
		}
		if(str1.equals(str2)){
			System.out.println("String is palindrom");
		}else{
			System.out.println("String is not palindrom");
		}
	}

}
