//Java program to convert int type variables to char
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num1=sc.nextInt();
	    int num2=sc.nextInt();
	    char a = (char)num1;
	    char b = (char)num2;
		System.out.println(a);
		System.out.println(b);
	}
}
