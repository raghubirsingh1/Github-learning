package com.nt.innerclass;

class Test5{
	private static Test5 t=new Test5();
	private Test5(){
		
	}
	public static Test5 getTest5(){
		return t;
	}
}
