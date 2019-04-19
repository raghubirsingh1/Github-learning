package com.nt.pdflogical;

public class Anagram {
	public static void main(String[] args) {
		String str1="you are good";
		String str2="you are good";
		int string1=0;
		int string2=0;
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		if(ch1.length==ch2.length){
			for(int i=0;i<ch1.length;i++){
				string1=string1+ch1[i];
				string2=string2+ch2[i];
			}
			System.out.println(string1==string2);
		}else{
			System.out.println(false);

		}
		
		
	}

}
