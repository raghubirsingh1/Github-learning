package com.nt.zero;

import java.util.HashMap;
import java.util.Map;

public class CountString1 {
	public static void main(String[] args) {
		String str="this is a good this is a good";
		String[] str1=str.split(" ");
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<str1.length;i++){
			//String ch=str1[i];
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
