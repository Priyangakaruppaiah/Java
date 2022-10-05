//Java program to compare strings
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter String:");
	    String st1=sc.nextLine();
	    String st2=sc.nextLine();
	    if(st1.equals(st2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
		
	}
}
        

