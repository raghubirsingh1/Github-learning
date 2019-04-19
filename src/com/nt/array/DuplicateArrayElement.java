package com.nt.array;

public class DuplicateArrayElement {
	
	 static int[] a={2,8,7,9,7,8,2};
	 	public static void findDuplicate(int[] a){
	 		for(int i=0;i<a.length-1;i++){
	 			for(int j=i+1;j<a.length;j++){
	 				if(a[i]==a[j]){
	 					System.out.println(a[i]);
	 				}
	 			}
	 		}
	 	}
	 	public static void main(String[] args) {
			findDuplicate(a);
		}

}
