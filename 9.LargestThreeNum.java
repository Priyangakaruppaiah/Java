//Find largest among three numbers
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner rea=new Scanner(System.in);
	    System.out.println("Enter the number1:");
	    int n1=rea.nextInt();
	    System.out.println("Enter the number2:");
	    int n2=rea.nextInt();
	    System.out.println("Enter the number3:");
	    int n3=rea.nextInt();
	    if(n1>=n2 && n1>=n3)
	         System.out.println(n1+"is the largest number");
	    else if(n2>=n1 && n2>=n3)
	          System.out.println(n2+"is the largest number");
	    else
	         System.out.println(n3+"is the largest number");
	}
}
