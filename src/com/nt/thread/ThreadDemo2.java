package com.nt.thread;

class MyRunnable11 implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("child thread");
		}
	}
}
public class ThreadDemo2 {
	public static void main(String[] args){
	MyRunnable11 r=new MyRunnable11();
	Thread t=new Thread(r);
	t.start();
	for(int i=0;i<=5;i++){
		System.out.println("main thread");
	}
	}
}
