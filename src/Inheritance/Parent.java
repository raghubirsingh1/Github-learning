package Inheritance;

class Parent {
	void parent(){
		System.out.println("parent method");
	}

}
class Child1 extends Parent{
	void childOne(){
		System.out.println("child1 method");
	}
}
class Child2 extends Parent{
	void childTwo(){
		System.out.println("child2 method");
	}
}