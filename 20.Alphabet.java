//Java program to display alphabets (A to Z)
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		if(ch=='A'){
		   for(ch='A';ch<='Z';ch++){
		       System.out.println(ch+" ");
	     	}
		}
		else if(ch=='a'){
		   for(ch='a';ch<='z';ch++){
		       System.out.println(ch+" ");
	     	}
		}
		else
		    System.out.println("no ");
		
	}
}
