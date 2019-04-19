package com.nt.thread;

public class ArmgStrong {
	
	public static void main(String[] args) {
		int no=371,res=0,rem;
		int temp=no;
		while(temp!=0){
			rem=temp%10;
			res+=rem*rem*rem;
			temp=temp/10;
		}
		if(res==no){
			System.out.println("no is armgstrong");
		}else{
			System.out.println("no is not armgstrong");
		}
	}

}
