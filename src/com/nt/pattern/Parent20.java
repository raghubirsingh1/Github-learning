package com.nt.pattern;

class Parent20 {
	
	public void add(int a,int b) throws Exception{
		System.out.println("Class Parent");
	}
}
class Child20 extends Parent20{
	public void add(int a,int b){
		System.out.println("Parent class");
	}
	
	public static void main(String[] args) throws Exception {
		Parent20 p2=new Parent20();
		p2.add(10, 20);
		//Child20 c2=new Child20();
		//c2.add(20, 30);
	}
}

