//Java program to find GCD using recursion
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n1=sc.nextInt();
		System.out.println("Enter the number:");
		int n2=sc.nextInt();
		int hcf=hcf(n1,n2);
		System.out.printf("%d",hcf);
		
	}
	public static int hcf(int n1,int n2){
	    if(n2!=0)
	       return hcf(n2,n1 % n2);
	     else
	        return n1;
	}
}

