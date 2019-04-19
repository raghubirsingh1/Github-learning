package com.nt.zero;

import java.util.HashMap;
import java.util.Map;

public class CountChar {
	public static void main(String[] args) {
		String str="raghubirsingh";
		char[] ch=str.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<ch.length;i++){
			if(!map.containsKey(ch[i])){
				map.put(ch[i], 1);
			}else{
				int j=map.get(ch[i]);
				map.put(ch[i], ++j);
			}
		}
		System.out.print(' ');
		System.out.println(map);
	}

}
