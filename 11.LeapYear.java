//Java program to check a leap year
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the leap year:");
	    int n1=sc.nextInt();
	    if(((n1%400==0)&&(n1%100==0))||((n1%100!=0)&&(n1%4==0))){
	        System.out.println("leap year");
	    }
	   
	    else{
	        System.out.println(n1 +"not leap year");
	    }
	 }
}
