package Inheritance;

public class C extends B {
	void showC() {
		System.out.println("showC method");
	}

	public static void main(String[] args) {
		A a=new A();
		a.showA();
		System.out.println("==================");
		B b=new B();
		b.showA();
		b.showB();
		System.out.println("=========================");
		C c=new C();
		c.showA();
		c.showB();
		c.showC();
	}
}
