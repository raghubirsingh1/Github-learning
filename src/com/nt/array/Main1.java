package com.nt.array;

interface A1{
	final int a=10;
	public void display();	
}
class Main1 implements A1 {
	
	public void display(){
		System.out.println("abc");
	}
	
	public static void main(String[] args){
		Main1 m=new Main1();
		m.display();
		System.out.println(a);
	}
}
