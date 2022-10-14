//Java program to create file and write to the file
import java.io.File;
public class Main
{
	public static void main(String[] args) {
          File file=new File("trincat.java");
          try{
              boolean value=file.createNewFile();
              if(value){
                  System.out.println("New Java File is Created.");
                  
              }
              else{
                    System.out.println("Java File is already exist.");
              }
          }
          catch(Exception e){
              e.getStackTrace();
          }
	}
}

