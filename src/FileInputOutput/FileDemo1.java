package FileInputOutput;

import java.io.File;

public class FileDemo1 {
	public static void main(String[] args) {
		int count=0;
		File f=new File("D:/Java Program");
		String[] s=f.list();
		for(String s1:s){
			count++;
			System.out.println(s1);
		}
		System.out.println("total count= "+count);
	}

}
