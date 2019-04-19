package com.nt.zero;

import java.util.ArrayList;
import java.util.List;

public class Fabiccoi {
	private static  List<Integer> list=new ArrayList<>();
	private static int i=0;
	
	public static int get(int n){
		if(list.size()==0){
			list.add(0);
			list.add(1);
		}
		if(n==1 || n-1==0){
			return 1;
		}
		else{
		  list.add(list.get(i)+list.get(++i));
           get(n-1) ; 
		}
		return 0;
	}
	
  public static void main(String[] args) {
	get(10);
	System.out.println(list);
}
}
