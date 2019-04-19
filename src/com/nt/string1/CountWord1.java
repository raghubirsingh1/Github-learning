package com.nt.string1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWord1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<s1.length;i++){
			if(!map.containsKey(s1[i])){
				map.put(s1[i], 1);
			}else{
				map.put(s1[i], map.get(s1[i]+i));
			}
		}
		System.out.println(map);
	}

}
