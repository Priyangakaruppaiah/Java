//Java program to display Fibonacci series
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=sc.nextInt();
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<n1;++i){
		    int c=a+b;
		    System.out.println(c);
		    a=b;
		    b=c;
		 }
	}
}
