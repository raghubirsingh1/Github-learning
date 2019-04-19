package com.nt.string;

public class Word {
	public static void main(String[] args) {
		String str="java Developer";
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++){
			String word=words[i];
		}
		System.out.println(words);
	}

}
