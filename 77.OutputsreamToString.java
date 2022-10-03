// Java program to convert OutputStream to String
import java.io.*;
public class Main
{
	public static void main(String[] args)throws IOException {
	    ByteArrayOutputStream stream=new ByteArrayOutputStream();
	    String line="HELLO THERE!";
	    
	    stream.write(line.getBytes());
	    String finalString=new String (stream.toByteArray());
		System.out.println(finalString);
	}
}

