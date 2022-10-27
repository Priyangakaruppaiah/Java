//Java program to differentiate == and equals()
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
    String s2=sc.nextLine();
    System.out.println("Check if two strings are equal");
    boolean result1=(s1==s2);
    System.out.println("Using == operator: " + result1);
    boolean result2=s1.equals(s2);
    System.out.println("Using equals(): " + result2);
      
	}
}
