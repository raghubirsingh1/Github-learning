package com.nt.neeraj;

class A {
	public void m1(){
		System.out.println("Neeraj");
	}
}
class B extends A{
	public void m1(){
		System.out.println("ABCDEF");
	}
	public static void main(String[] args) {
		A a=new A();
		a.m1();
	}
}
