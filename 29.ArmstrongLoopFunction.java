//Java program to display the armstrong numbers between intervals using function
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number");
	    int low=sc.nextInt();
	      System.out.println("Enter the number");
	    int high=sc.nextInt();
	    for(int number=low+1;number<high;++number){
	        if(arm(number)){
	            System.out.println(number+" ");
	        }
	    }
	   public static boolean arm(int num){
	       int digit=0;
	       int result=0;
	       int originalnumber=num;
	       while(originalnumber!=0){
	           originalnumber/=10;
               ++digits;
	       }
	       originalnumber=num;
	       while(originalnumber!=0){
	           int remainder=originalnumber%10;
	           result+=Math.pow(remainder,digits);
	           originalnumber/=10;
	       }
	       if(result==num)
	          return true;
	       return false;   
	    
		
	}
}




