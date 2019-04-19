package com.nt.thread;

public class PerfectNumber {
	
	public static void main(String[] args) {
		int no=6,sum=0;
		for(int i=0;i<no;i++){
			if(no%i==0){
				sum=sum+i;
			}
		}
		if(no==sum){
			System.out.println("no is perfect");
		}else{
			System.out.println("no is not perfect");
		}
	}

}
