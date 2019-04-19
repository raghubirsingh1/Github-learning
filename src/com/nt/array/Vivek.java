package com.nt.array;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Vivek {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		
		FileReader fileReader = new FileReader("vivek.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String readLine = bufferedReader.readLine();
		while(readLine!=null){
			System.out.println(readLine);
			readLine=	bufferedReader.readLine();
		}
		
	}

}
