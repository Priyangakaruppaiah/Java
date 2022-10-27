//Java Program to Calculate simple interest and compound interest
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the principal:");
	double principal=sc.nextDouble();
		System.out.println("Enter the time:");
	double time=sc.nextDouble();
		System.out.println("Enter the rate:");
	double rate=sc.nextDouble();
		System.out.println("Enter the number:");
	double number = input.nextDouble();

	double interest = (principal * time * rate) / 100;
    System.out.println("Simple Interest: " + interest);
    double interest = principal * (Math.pow((1 + rate/100), (time * number)))-principal;
     System.out.println("Compound Interest: " + interest);
	
	
	}
}


