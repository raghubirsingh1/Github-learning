package com.nt.pattern;

public final class Test1 {
	final int id;
	final String name;
	
	public Test1(int id,String name){
		this.id=id;
		this.name=name;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
}
