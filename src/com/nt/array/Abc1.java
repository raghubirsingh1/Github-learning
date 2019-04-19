package com.nt.array;

import java.util.HashMap;
import java.util.Map;

public class Abc1 {
	static public void main(String[] args) {
		String str="abcdabcde";
		char[] ch=str.toCharArray();
		Map map=new HashMap();
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j]){
					
					int k=ch[i];
				}
				
				break;
			}
			
		}
		
		

	}
}