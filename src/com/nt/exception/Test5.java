package com.nt.exception;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test5 {
	public static void main(String[] args) {
		String str="raghubir";
		char[] ch=str.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<ch.length;i++){
			
		if(!map.containsKey(ch[i])){
			map.put(ch[i], 1);
		}else{
			int j=map.get(ch[i]);
			map.put(ch[i], ++j);
		}
		}
		System.out.println(map);
	}
	

}
