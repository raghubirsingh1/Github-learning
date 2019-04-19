package com.nt.array;

interface One {
	
	 int x=888;

}
interface Two{
	int x=200;
}
class Three implements One,Two{
	public static void main(String args[]){
	 Three r=new Three();
	 System.out.println(One.x);
	 System.out.println(Two.x);
	}
}
