//Java program to calculate the sum of natural numbers
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner re=new Scanner(System.in);
	    int s=0;
	    System.out.println("Enter the number:");
	    int n=re.nextInt();
	    for(int i=1;i<=n;i++){
	        s=s+i;
	        
	    }
	    System.out.println(s+" is natural number is");
	}
}
