//Java program to calculate the power using recursion
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=sc.nextInt();
			System.out.println("Enter the number");
		int n2=sc.nextInt();
		int result=power(n1,n2);
		System.out.println(n1+"^"+n2+"="+result);
	}
	public static int power(int n1,int n2){
	    if(n2!=0){
	        return (n1*power(n1,n2-1));
	    }
	    else{
	        return 1;
	    }
	}
}

