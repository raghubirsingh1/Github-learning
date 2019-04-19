package com.nt.pattern;

public class AutoBOxingAndUnBoxing {
	
	static Integer I;//<========AutoBoxing
	public static void main(String[] args) {
		int i=I;//<======AutoUnBoxing
		methodOne(i);
	}
	public static void methodOne(Integer I){//<=====AutoBoxing
		int k=I;//<=========AutoUnboxing
		System.out.println(k);
		
	}

}
