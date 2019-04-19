package com.nt.string1;

public class ArmstrongNum {
	public static void main(String[] args) {
		int no=154,total=0,rem;
		int temp=no;
		while(temp!=0){
			rem=temp%10;
			total=total+rem*rem*rem;
			temp=temp/10;
		}
		if(total==no){
			System.out.println("no is armgstrog");
		}else{
			System.out.println("no is not arm");
		}
	}

}
