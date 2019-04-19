package com.nt.exception;

public class SingletonClass {
	
	private static SingletonClass s=new SingletonClass();
	
	private SingletonClass(){
		
	}
	public static SingletonClass getSingletonClass(){
		return s;
	}

}
