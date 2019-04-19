package com.nt.string;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		System.out.println("Enter any Array Element");
		int[] a={4,8,5,6,8,44,68};
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				System.out.println(a[i]);
			}
		}
	}

}
