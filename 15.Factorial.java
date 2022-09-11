//Java program to find factorial of a number
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int s=1;
		for(int i=1;i<=n;i++){
		    s=s*i;
		}
		System.out.println(s+"is a factorial");
	}
}
