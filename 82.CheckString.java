//Check if a string is numeric
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    boolean numeric=true;
	    try{
	        Double num = Double.parseDouble(s1);
	    }
	    catch(NumberFormatException e){
	        numeric =false;
	    }
	    if(numeric)
		   System.out.println(s1 + " is a number");
		 else
		     System.out.println(s1 + " is not a number");
	}
}
