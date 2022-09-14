//Java program to check Palindrome string
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s1=sc.nextLine();
		int strLength=s1.length();
		String r="";
		
		for(int i=(strLength-1);i>=0;i--){
	         r=r+s1.charAt(i);
		}
		if(s1.toLowerCase().equals(r.toLowerCase())){
		    System.out.println(s1+" is a Palindrome string");
		   }
		else{
		     System.out.println(s1+" is  Not a Palindrome string");
		}
	}
}
