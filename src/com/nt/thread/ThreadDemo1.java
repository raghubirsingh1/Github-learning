package com.nt.thread;

class MyThreade extends Thread{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("child Thread");
		}
	}
}
public class ThreadDemo1 {
	public static void main(String[] args) {
		MyThreade t=new MyThreade();
		t.start();
		for(int i=0;i<=5;i++){
			System.out.println("Main Thread");
		}
	}

}
