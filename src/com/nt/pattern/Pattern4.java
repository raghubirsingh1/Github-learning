package com.nt.pattern;

public class Pattern4 {
/*	 String sno;
	 int sal;
	
	@Override
	public   int hashCode() {
		int sum=0;
		for(int i=0;i<this.sno.length();i++)
		sum = sum+this.sno.charAt(i);
		return sum;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Pattern4){
			Pattern4 pat =(Pattern4)obj;
			return this.sno.equals(pat.sno) && this.sno==pat.sno;
		}
		return false;
	}
*/

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++){
			char a='A';
			for(int j=4;j>=i;j--){
					
				System.out.print(a++);
			}
			
			for(int k=1;k<=i;k++){
				System.out.print("  ");
			}
			char b='D';
			for(int l=3;l>=i;l--){
			
				
				System.out.print(b--);
			}
			System.out.println("");
		}
		    
		/*for(int i=0;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--){
				System.out.print("X");
			}
			System.out.println("");
		}
		*/
	}

}
