//java  program to delete empty and non empty directory
import java.io.File;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		try{
		    File directory= new File("Directory");
		    boolean  result = directory.delete();
		    if(result){
		        System.out.println("Directory Deleted");
		    }
		    else{
		        System.out.println("Directory not found");
		    }
		}
		catch(Exception e){
		    e.getStackTrace();
		}
	}
}

