//Java program to load a Text File as InputStream
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
	 File file=new File("trinoncat.txt");
          try{
              boolean value=file.createNewFile();
              if(value){
                  System.out.println("New Java File is Created");
                  
              }
              else{
                    System.out.println("Java File is already exist");
              }
          }
          catch(Exception e){
              e.getStackTrace();
          }
		try{
		    InputStream input=new FileInputStream("trinoncat.txt");
		    System.out.println("Data in the file");
		    int i=input.read();
		    while(i!=-1){
		        System.out.println((char)i);
		        i=input.read();
		    }
		    input.close();
		}
		catch(Exception e){
		    e.getStackTrace();
		}
	}
}


