//Java program to convert a string into the inputstream
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    String name=sc.nextLine();
	    System.out.println("String is:"+name);
	    try{
	        InputStream stream=new ByteArrayInputStream(name.getBytes(StandardCharsets.UTF_8));
	        System.out.println("InputStream:"+stream);
	        System.out.println("Available bytes at the beginning:"+stream.available());
	        stream.read();
	        stream.read();
	        stream.read();
	        System.out.println("Available bytes at the end:"+stream.available());
	        stream.close();
	    }
	    catch (Exception e){
	        e.getStackTrace();
	    }
	
	}
}


