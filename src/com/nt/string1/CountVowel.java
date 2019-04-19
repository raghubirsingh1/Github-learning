package com.nt.string1;

public class CountVowel {
	public static void main(String[] args) {
		String str="abcdefegindkhgkdildnvohdgtd";
		int vowel=1;
		int consonent=1;
		for(char i:str.toCharArray()){
			if(i!='a' && i!='e' && i!='i' && i!='o' && i!='u'){
				consonent++;
			}else{
				vowel++;
			}
		}
		System.out.println(consonent);
		System.out.println(vowel);
	}

}
