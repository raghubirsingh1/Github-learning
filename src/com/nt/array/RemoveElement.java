package com.nt.array;

public class RemoveElement {
	
	public static void main(String[] args) {
		int[] a={1,5,4,7,8,7,9,6,4};
		int delete=1;
		for(int i=0;i<a.length;i++){
			if(delete==a[i]){
				for(int j=i;j<a.length-1;j++){
					a[j]=a[j+1];
				}
				break;
			}
			
		}
		for(int i=0;i<a.length-1;i++){
			System.out.println(a[i]);
		}
	}

}
