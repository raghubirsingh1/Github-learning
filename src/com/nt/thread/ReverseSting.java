package com.nt.thread;

public class ReverseSting {
	public static void main(String[] args) {
		String str="raghubir";
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			System.out.println(ch[i]);
		}
	}

}
