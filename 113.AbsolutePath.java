//Get file name from the absolute path using getName()

import java.io.File;
public class Main
{
	public static void main(String[] args) {

	File file=new File("D:\\zpriyangak/programs/test.java");
	String fileName=file.getName();
	System.out.println("File Name:" + fileName);
	}
}

