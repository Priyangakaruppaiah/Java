//Java program to convert String to boolean 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean b1=Boolean.parseBoolean(s1);
		boolean b2=Boolean.parseBoolean(s2);
		System.out.println(b1);
		System.out.println(b2);
	}
}
