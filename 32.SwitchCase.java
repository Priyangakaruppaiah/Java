//Java program to make a simple calculator using switch case
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the operator:");
		char op=sc.next().charAt(0);
		float result;
		System.out.println("Enter the number 1:");
		float n1=sc.nextInt();
		System.out.println("Enter the number 2:");
		float n2=sc.nextInt();
		switch(op){
		    case '+':
		        result=n1+n2;
		        System.out.println("Addition of the number  of n1 and n2 is:"+result);
		        break;
		     case '-':
		         result=n1-n2;
		        System.out.println("Subtraction of the number  of n1 and n2 is:"+result);
		        break;
		     case '*':
		         result=n1*n2;
		        System.out.println("Multiplication the number  of n1 and n2 is:"+result);
		        break;
		      case '/':
		        result=n1/n2;
		        System.out.println("Division of the number  of n1 and n2 is:"+result);
		        break;
		      default:
		        System.out.println("There is no matches");
		        break;
		}
	}
}

