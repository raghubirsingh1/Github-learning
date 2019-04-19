package com.nt.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDuplicateChar {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String str=sc.nextLine();
		//String str="raghubirsingh";
		char[] ch=str.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<ch.length;i++){
			if(map.get(ch[i])==null){
				map.put(ch[i], 1);
			}else{
				map.put(ch[i], map.get(ch[i])+1);
			}
		}
		map.remove(' ');
		System.out.println(map);
	}

}
