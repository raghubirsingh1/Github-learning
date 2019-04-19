package com.nt.pattern;

public class ReverseString {

	public static String reverse(String s) {
		if (s == null || s.trim().length() == 0)
			return "provide valid string";
		String s1 = "";
		if (s.length() - 2 < 0)
			return s;
		String s2 = s.substring(0, s.length() - 1);
		s1 = s.substring(s.length() - 1) + reverse(s2);
		return s1;
	}

	public static void main(String[] args) {
		System.out.println("hi  ::" + reverse("rai"));
	}
}
