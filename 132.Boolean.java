//Java Program to Check if two of three boolean variables are true
import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	    boolean first;
	    boolean second;
	    boolean third;
	    boolean result;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the firsrt Number:");
	    first=sc.nextBoolean();
	    System.out.println("enter the second Number:");
	    second=sc.nextBoolean();
	    System.out.println("enter the third  Number:");
	    third=sc.nextBoolean();
	    if(first){
	       result=second || third;
	    }
	    else{
	       result=second && third; 
	    }
	    if(result){
	       System.out.println("the boolean value is true");
	    }
	    else{
	       System.out.println("the boolean value is not true");
	    }
	    sc.close();  
	}
}
OUTPUT:
enter the firsrt Number:
true
enter the second Number:
false
enter the third  Number:
true
the boolean value is true
