//Java program to convert milliseconds to minutes and seconds
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    long milliseconds=sc.nextLong();
	    long seconds=TimeUnit.MILLISECONDS.toSeconds(milliseconds);
	    System.out.println(milliseconds+"MilliSeconds=" + seconds + "Seconds");
	    long minutes=TimeUnit.MILLISECONDS.toMinutes(milliseconds);
	    System.out.println(milliseconds +"MilliSeconds="+minutes+"Minutes");
	}
}


