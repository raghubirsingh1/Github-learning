package com.nt.string1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any character");
		String ch=sc.nextLine();
		char[] ch1=ch.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<ch1.length;i++){
			if(map.get(ch1[i])==null){
				map.put(ch1[i], 1);
			}else{
				map.put(ch1[i], map.get(ch1[i]+1));
			}
		}
		map.remove(' ');
		System.out.println(map);
	}
}
