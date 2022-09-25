//Java program to remove all whitespaces from a string
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s1=sc.nextLine();
			System.out.println("Original senence:"+s1);
			
			s1=s1.replaceAll("\\s","");
			System.out.println("After replacement:"+s1);
	}
}
