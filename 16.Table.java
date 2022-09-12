//Java program to generate Multiplication table
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n1=sc.nextInt();
	    for(int i=1;i<=10;i++){
	       int d=n1*i;
	       System.out.printf("%d * %d = %d \n",n1,i,d);
	    }
	
	}
}
