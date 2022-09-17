//Java program to display the Factors of a number
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number:");
		 int n1=sc.nextInt();
		  for(int i=1;i<=n1;i++){
		     if(n1%i==0)
		           System.out.println(i+" ");
		 }
	}
}
