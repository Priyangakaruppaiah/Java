//Write a java program to find the prime numbers between start to end using functions
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n1=sc.nextInt();
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n1=sc.nextInt();
		while(n1<n2){
		    if(checkPrimeNumber(n1)){
		        System.out.println(n1+"");
		    ++n1;
		}
	}
    	public static boolean checkPrimeNumber(int num){
	    boolean flag=true;
	    for(int i=2;i<=num/2;++i){
	        if(num%i==0){
	            flag=false;
	            break;
	        }
	    }
	    return flag;
	}
}
