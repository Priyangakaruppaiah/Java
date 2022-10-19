//File Extension in java
import java.io.File;
public class Main
{
	public static void main(String[] args){
	File file=new File("Test.java");
	String fileName=file.toString();
	int index= fileName.lastIndexOf('.');
	if(index>0){
	    String extension = fileName.substring(index+1);
	    System.out.println("File extension is "+extension);
	}
	}
}

