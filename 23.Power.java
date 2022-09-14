//Java program to calculate the power of a number
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base number:");
		int n1=sc.nextInt();
	    System.out.println("Enter the exponent number:");
		int n2=sc.nextInt();
		long r;
		for(r=1;n2!=0;--n2){
		    r*=n1;
		    
		}
		System.out.print("Answer="+r);
		
	}
}
