package com.nt.array;

import java.util.Arrays;

public class ArrayPrint {

	public static void print(int[][] array, int n) {
		int[][] temp = null;
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		if (array.length == 1) {
			System.out.print(array[0][0]+" ");
			return;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(array[0][i]+" ");
		}
		for (int i = 1; i < n - 1; i++) {
			System.out.print(array[i][n - 1]+" ");
		}
		for (int i = n - 1; i >=0; i--) {
			System.out.print(array[n - 1][i]+" ");
		}
		for (int i = n - 2; i >= 1; i--) {
			System.out.print(array[i][0]+" ");
		}
		if (n > 2) {
			temp = new int[n - 2][n - 2];
		} else {
			return;
		}
		System.out.println();
		for (int i = 0; i < n - 2; i++) {
			for (int j = 0; j < n - 2; j++) {
				temp[i][j] = array[i+1][j+1];
			}
		}
		array = temp;
		
		print(array, array.length);
	}
	public static void main(String[] args) {
     	int[][] array={{1,3,5,4,6},{8,5,3,4,3},{5,0,5,7,5},{5,7,6,3,8},{9,8,4,3,2}};
     	print(array,5);
    //  int[][] array={{1,3,5,4,6,8},{8,5,3,4,3,4},{5,0,5,7,5,6},{5,7,6,3,8,1},{9,8,4,3,2,3},{1,2,3,4,5,6}};
    //  print(array,6);
	}
}
