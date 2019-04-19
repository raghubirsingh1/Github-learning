package com.nt.string1;

public class DuplicateNumber {
	public static void main(String[] args) {
		int[] a={1,5,4,8,9,6,7,5,7};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.println(a[i]);
				}
			}
		}
	}
}
