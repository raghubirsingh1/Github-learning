package com.nt.string1;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int no=157,total=0,rem;
		int temp=no;
		while(temp!=0){
			rem=temp%10;
			total=total+rem*rem*rem;
			temp=temp/10;
		}
		if(total==no){
			System.out.println("no is armstrong");
		}else{
			System.out.println("no is not armstrong");
		}
	}

}
