package Inheritance;

 class Child3 extends Parent{
	 void childThree(){
		 System.out.println("child three");
	 }

	public static void main(String[] args) {
		Child1 c1=new Child1();
		Child2 c2=new Child2();
		Child3 c3=new Child3();
		c1.childOne();
		c1.parent();
		System.out.println("==============");
		c2.childTwo();
		c2.parent();
		System.out.println("=============");
		c3.parent();
		c3.childThree();

	}

}
