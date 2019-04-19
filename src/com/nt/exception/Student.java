package com.nt.exception;

public final class Student {
	final int sno;
	final String name;
	
	private Student(int sno,String name){
		this.sno=sno;
		this.name=name;
	}
	
	public int getSno(){
		return sno;
	}
	public String getName(){
		return name;
	}
	public static void main(String[] args) {
		Student s=new Student(101,"raghubir");
		System.out.println(s.getSno());
		System.out.println(s.getName());
	}
}
