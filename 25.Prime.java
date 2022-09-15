//Write a java program to find a given number is prime or not.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		boolean flag=false;
		for(int i=2;i<n;i++){
		    if(n%i==0){
		        flag=true;
		        break;
		    }
		}
		if(flag){
		      System.out.println(n+"Not a prime number");
		  }
		else{
		    System.out.println(n+"Prime number");
		}
  }
}

