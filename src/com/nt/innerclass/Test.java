package com.nt.innerclass;

public  class Test{
	public static void main(String[] args) {
		WithOutName n=new WithOutName()
		{
			public void popCorn(){
				System.out.println("tasty");
			}
		};
		n.popCorn();
		
		Runtime runtime = Runtime.getRuntime();
		Runtime runtime2 =Runtime.getRuntime();
		
	     System.out.println();
	}
}