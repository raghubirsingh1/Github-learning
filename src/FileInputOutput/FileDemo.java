package FileInputOutput;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		File f=new File("D:/","demo.txt");
		f.createNewFile();
		System.out.println(f);		
	}
}