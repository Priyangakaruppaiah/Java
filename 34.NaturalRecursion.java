//Java program to find the sum of natural numbers using recursion
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=sc.nextInt();
		int sum=addNumbers(n1);
		System.out.println("sum="+sum);
		
	}
	public static int addNumbers(int num){
	    if(num!=0)
	         return num + addNumbers(num-1);
	    else
	         return num;
	         
	}
}
