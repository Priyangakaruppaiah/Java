//Java program to append text to an existing file
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class Main
{
	public static void main(String[] args) {
	    String path=System.getProperty("style.css ") + "  ";
	    String text = "Added text";
	    
	    try{
	      Files.write(Paths.get(path),text.getBytes(),StandardOpenOption.APPEND);
	    }
		catch(IOException e){
		    
		}
	}
}

