//Java program to find the frequency of character in a string
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the string:");
	    String str=sc.nextLine();
	    char  ch=str.charAt(1);
	    int frequency=0;
	    for(int i=0;i<str.length();i++){
	        if(ch==str.charAt(i)){
	            ++frequency;
	        }
	    }
	    System.out.println("frequency of number is" + ch + " = "+frequency);
		
	}
}
