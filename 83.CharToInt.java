//Java program to convert char to int
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    char a21=sc.next().charAt(0);
	    char a34=sc.next().charAt(0);
	    int num1=Character.getNumericValue(a21);
	    int num2=Character.getNumericValue(a34);
	    System.out.println(num1);
	    System.out.println(num2);
		
	}
}
