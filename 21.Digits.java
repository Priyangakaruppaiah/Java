//Java program to count number of digits in an integer
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    int n=sc.nextInt();
	    int count=0;
	    while(n!=0){
	        n/=10;
	        ++count;
	    }
	    System.out.println("Number of digits:"+count);
		
}
