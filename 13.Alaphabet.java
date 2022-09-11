//Java program to check whether a character is Alphabet or Not
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		if((ch>= 'a' && ch <='z' )|| (ch >='A' && ch <='Z')){
		    System.out.println(ch+" is an Character");
		}
		else{
		     System.out.println(ch+"is not a Character");
		  }

	}
}
