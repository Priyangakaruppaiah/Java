//Java program to convert character to string and vice-versa
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter character:");
		char c1=sc.next().charAt(2);
		String str=Character.toString(c1);
		System.out.println("The string is:"+str);
		
	}
}
