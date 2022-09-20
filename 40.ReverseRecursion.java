//Java program to reverse a sentence using recursion
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sttring");
		String n1=sc.nextLine();
		String reversed=reverse(n1);
		System.out.println("The reversed string is:"+reversed);
		
	}
	public static String reverse(String n1){
	    if(n1.isEmpty())
	        return n1;
	    return reverse(n1.substring(1))+n1.charAt(0);      
	}
}
