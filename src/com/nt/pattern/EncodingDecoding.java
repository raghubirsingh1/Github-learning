package com.nt.pattern;

public class EncodingDecoding {
	
	public static String getDecodeString(String s){
        int k=0; int l=0;
        char[] ch1 =s.toCharArray();
        String s2="";
        for(int i=0;i<ch1.length;i++){
       	 char ch =ch1[i];
       	 for(int j=i;j<ch1.length;j++){
       		 char ch3=ch1[j];
       		 if(ch==ch3)
       		 {
       			 k++;l++;
       		 }else         
 
       			 break;
       	 }
       	 s2=s2+String.valueOf(k)+String.valueOf(ch);
       	 i=l;
       	 k=0;
        }
        return s2;
	}
	public static void main(String[] args) {
	         String s = "AAAABBYYYNNNAAAMMOO";
	         System.out.println(getDecodeString(s));
	         System.out.println(getDecodeString("AAAA"));
	         
		}

	}


