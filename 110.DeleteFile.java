//Java program to delete file in java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	try{
	    Path path = Paths.get("Javafile.java");
	    boolean value=Files.deleteIfExists(path);
	    if(value){
	        System.out.println("Java file del");
	    }
	    else{
	        System.out.println("Java file does not exist");
	    }
	    
	}
	catch(Exception e){
	    e.getStackTrace();
	    
	}
	}
}

