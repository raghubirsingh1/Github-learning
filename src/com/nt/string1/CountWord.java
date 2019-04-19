package com.nt.string1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWord {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=sc.nextLine();
		//String str="This is new book This book";
		String[] str1=s1.split(" ");
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<str1.length;i++){
			//String s=str1[i];
			if(!map.containsKey(str1[i])){
				map.put(str1[i], 1);
			}else{
				int j=map.get(str1[i]);
				map.put(str1[i], ++j);
			}
		}
		System.out.println(map);
	}

}
