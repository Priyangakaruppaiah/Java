//Java program to find LCM of two numbers
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number n1:");
		int a=sc.nextInt();
		System.out.println("Enter the number n2:");
		int b=sc.nextInt();
		int i;
		int a1=(a>b)?a:b;
		for(i=a1;i<=a*b;i=i+a1){
		    if(i%a==0 && i%b==0)
		        break;
		}        
		System.out.println("LCD OF " +a+ "and" +b+ "is" +i); 
    }
}
