//Java program to display Armstrong number between two intervals
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int low=sc.nextInt();
		System.out.println("Enter the number:");
		int high=sc.nextInt();
		for(int number=low+1;number<high;++number){
		    int digit=0;
		    int result=0;
		    int original=number;
		    while(original!=0){
		        original/=10;
		        ++digit;
		    }
		    original=number;
		    while(original!=0){
		        int remainder=original%10;
		        result+=Math.pow(remainder,digit);
		        original/=10;
		    }
		    if(result==number){
		        System.out.println(number+"");
		    }
		}
	}
}


