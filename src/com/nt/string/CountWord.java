package com.nt.string;

public class CountWord {
	public static void main(String[] args) {
		String str="hii  hello how are you";
		int count=1;
		//char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++){
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')){
				count++;
			}
		}
		System.out.println(count);
	}

}
