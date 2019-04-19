package com.nt.array;

import java.util.HashSet;

public class DuplicateRemove {
	public static void main(String[] args) {
		int[] arr1={5,8,9,7};
		int[] arr2={5,9,2,6,8};
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					hs.add(arr1[i]);
				}
				//break;
			}
		}
		for(int no:hs){
			System.out.println(" "+no);
		}
	}

}
