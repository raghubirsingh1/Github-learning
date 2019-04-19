package com.nt.innerclass;

 class StaticNested {
	 static class Nested{
		 
		 public void methodOne(){
			 System.out.println("nested inner class");
		 }
	 }
	public static void main(String[] args) {
		StaticNested.Nested sn=new StaticNested.Nested();
		sn.methodOne();
	}
	

}
