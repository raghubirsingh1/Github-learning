package com.nt.mind;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int no=153,total=0,rem;
		int temp=no;
		while(temp!=0){
			rem=temp%10;
			total=total+rem*rem*rem;
			temp=temp/10;
		}
		if(no==total){
			System.out.println("no is armstrong");
		}else{
			System.out.println("no is not armstrong");
		}
	}

}
