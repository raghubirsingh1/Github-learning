package com.nt.string;

public class CountString1 {

	public static void pair(int[] a, int sum) {	
		for (int i = 0; i < a.length; i++) {
			int k = a[i];
			for (int j = i + 1; j < a.length; j++) {
				int l = a[j];		
				if (k + l == sum) {
					System.out.println(k + " " + l);
					a[j]=0;
					break;
				}

			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 5, 5,6, 10, 6,7, 8, 2, 4 };
		pair(a, 12);

		/*
		 * String str="ABDFCa"; 
		 * String s1="";
		 *  char[] ch=str.toCharArray();
		 * for(int i=0;i<ch.length;i++){
		 *  char ch1=ch[i];
		 *   int k=ch1; if(k>96 && k<123){ 
		 *   s1=s1+ch1; 
		 *   } 
		 *   }
		 *   System.out.println(s1);
		 */

		/*
		 * char[] ch=str.toCharArray();
		 *  for(int i=0;i<ch.length;i++){
		 *   char ch1=ch[i];
		 *    int k=ch1;
		 *     if((k>64 && k<91) ||(k>96 && k<123 )){
		 * s1=s1+ch1; 
		 * }
		 *  }
		 *   System.out.println(s1);
		 */

		/*
		 * String[] s=str.split(" "); 
		 * Map<String,Integer> map=new LinkedHashMap<>();
		 *  for(int i=0;i<s.length;i++){
		 *   String s1=s[i];
		 * if(!map.containsKey(s1)){
		 *  map.put(s1, 1);
		 *   }else{
		 *    int j=map.get(s1);
		 * map.put(s1, ++j); }
		 *  } 
		 *  System.out.println(map);
		 */

		/*
		 * char[] ch = str.toCharArray();
		 *  String s1 = ""; List<String> list =new ArrayList<>();
		 *   for (int i = 0; i < ch.length; i++) {
		 *    char ch1 = ch[i];
		 *     if (ch1 != ' ') {
		 *     s1 = s1 + ch1; 
		 *     } else { 
		 *     list.add(s1);
		 *      s1 ="";
		 *       }
		 *        if (i == ch.length - 1) 
		 *        list.add(s1);
		 *         }
		 * System.out.println(list);
		 */
	}
}
