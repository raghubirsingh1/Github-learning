package com.nt.thread;

class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<=5;i++){
			Thread.yield();
			System.out.println("child thread");
		}
	}
}
public class ThreadYieldDemo {
	public static void main(String[] args) {
		MyThread1 t=new MyThread1();
		t.start();
		for(int i=0;i<=10;i++){
			System.out.println("Main Thread");
		}
	}

}
