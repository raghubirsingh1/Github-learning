package com.nt.pattern;

public class Pattern3 {
	public static void main(String[] args) {

		for (char i = 'E'; i >= 'A'; i--) {

			for (char j = 'A'; j <= i; j++) {

				System.out.print(j);

			}

			for (char j = (char) ('E' - i); j >= 1; j--) {
				System.out.print("*");
			}
			for (char j = (char) ('E' - i); j >= 1; j--) {
				
				System.out.print("*");
			}
			for (char j = (char) (i ); j >= 'A'; j--) {

				if(j<'E')
				System.out.print(j);
			}

			System.out.println();

		}

	}

}
