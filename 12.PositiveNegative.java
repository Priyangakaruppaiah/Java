//Check if a number is positive or negative
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number::");
	    double n1=sc.nextDouble();
	    if(n1>0.0){
	        System.out.println("Positive number");
	    }
	    else if(n1<0.0){
	        System.out.println("Negative number");
	    }
	    else{
	        System.out.println("Number is zero");
	    }
	    
	}
}
