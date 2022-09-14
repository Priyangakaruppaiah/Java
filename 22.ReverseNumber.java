//Reverse a number using a while loop in java
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Number:");
	    int n=sc.nextInt();
	    int c=0;
	    while(n!=0){
	        int digit=n%10;
	        c=c*10+digit;
	        n/=10;
	    }
	    System.out.println("Reversed number is:"+c);
		
	}
}
