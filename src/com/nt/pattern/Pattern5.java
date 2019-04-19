package com.nt.pattern;

public class Pattern5 {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(k);
			}
			int m=1;
			for(int l=2;l<=i;l++){
				
				System.out.print(m++);
			}
			System.out.println("");
		}
		
	}

}
