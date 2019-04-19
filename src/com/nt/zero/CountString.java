package com.nt.zero;

import java.util.HashMap;
import java.util.Map;

public class CountString {
	public static void main(String[] args) {
		String str="This is good person very good";
		String[] ch=str.split(" ");
		
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<ch.length;i++){
			String str1=ch[i];
			if(!map.containsKey(str1)){
				map.put(str1, 1);
			}else{
				int j=map.get(str1);
				map.put(str1, ++j);
	     	}	
		}
		System.out.println(map);
		
	}

}
