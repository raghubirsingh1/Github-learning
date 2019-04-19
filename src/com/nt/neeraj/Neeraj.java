package com.nt.neeraj;

public class Neeraj {
	
	public void methodOne(){
		System.out.println("no argument");
	}
	public void methodOne(int a){
		System.out.println("int argument");
	}
	public void methodTwo(double d){
		System.out.println("double argument");
	}
	public static void main(String args[])
	{
		Neeraj n=new Neeraj();
		n.methodOne();//no argument
		n.methodOne('a');//int argument
		n.methodTwo(12.2);//double argument
	}
}