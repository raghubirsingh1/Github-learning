package com.nt.string;

import java.util.Scanner;

public class Feb {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		String s=sc.nextLine();
		
		String str2 = "";
		char[] ch = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			str2 = str2 + ch[i];
		}

		if (s.equals(str2)) {
			System.out.println("String is palindrom");
		} else {
			System.out.println("stirng is not palindrom");
		}

	}

}
