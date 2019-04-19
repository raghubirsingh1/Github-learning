package com.nt.array;

import java.text.NumberFormat;

public class PrintNumberFormat {
	
	public static void main(String[] args) {
		long num=868967857;
		NumberFormat format=NumberFormat.getInstance();
		format.setGroupingUsed(true);
	  System.out.println(format.format(num));
	}
}
