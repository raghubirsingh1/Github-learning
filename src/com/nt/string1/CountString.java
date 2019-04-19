package com.nt.string1;

public class CountString {
	public static void main(String[] args) {
		String str="my name is raghu";
		int count=1;
		for(int i=0;i<str.length();i++){
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')){
				count++;
			}
		}
		System.out.println(count);
	}
}
