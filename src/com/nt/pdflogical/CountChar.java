package com.nt.pdflogical;

import java.util.HashMap;
import java.util.Map;

public class CountChar {
	public static void main(String[] args) {
		String str="raghubir singh";
		char[] ch=str.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<ch.length;i++){
			if(map.get(ch[i])==null){
				map.put(ch[i], 1);
			}else{
				map.put(ch[i], map.get(ch[i])+1);
			}
			
		}
		map.remove(" ");
		System.out.println(map);
	}

}
