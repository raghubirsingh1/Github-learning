package com.nt.zero;

public class GetNumerical {
	public static void main(String[] args) {
		String str1="$ir%&(){rah}[hub]$";
		String str="";
		char[] ch=str1.toCharArray();
		for(int i=0;i<ch.length;i++){
			int k=ch[i];
			if((k>64 && k<91)||(k>96 && k<123)){
				str=str+ch[i];
			}
		}
		System.out.println(str);
	}
}
