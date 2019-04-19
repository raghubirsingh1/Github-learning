package com.nt.zero;

class Super{
	protected void abc(){
		System.out.println("super======");
	}
}
class Sub extends Super{
	protected void abc(){
		System.out.println("super==abc");
	}
	protected void bca(){
		System.out.println("super===bca");
	}
}
public class LogicalTest
{ 
    public static void main(String[] args) 
    { 
        Super obj = new Sub(); 
        //obj.bca(); 
    } 
} 
