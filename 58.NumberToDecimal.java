//Java program to round a number to n decimal places
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    double n=sc.nextDouble();
	    System.out.format("%.2f",n);
	
	}
}
