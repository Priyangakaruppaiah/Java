//Java program to find GCD of two numbers
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number n1:");
		int a=sc.nextInt();
		System.out.println("Enter the number n2:");
		int b=sc.nextInt();
		int gcd=1;
		for(int c=1;a>=c && b>=c;++c){
		    if(a%c==0 && b%c==0)
		        gcd=c;
		}        
		System.out.println("GCD OF " +a+ "and" +b+ "is" +gcd); 
    }
}
