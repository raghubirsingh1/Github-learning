package com.nt.zero;

public class Arm {
	public static void main(String[] args) {
		int no = 183, rem, total = 0;
		int temp = no;
		while (temp != 0) {
			rem = temp % 10;
			total = total + rem * rem * rem;
			temp = temp / 10;
		}
		if (no == total) {
			System.out.println("no is arm");
		} else {
			System.out.println("no is not arm");
		}
	}

}
