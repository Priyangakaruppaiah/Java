//Java program to check if an array contains a given value
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Ente the number:");
	    int n=sc.nextInt();
	    int[] a=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();;
	    }
	     System.out.println("Ente the search number:");
	    int toFind=sc.nextInt();
	    boolean found=false;
	    for(int n12 : a){
	        if(n12==toFind){
	            found=true;
	            break;
	        }
	    }
	   if(found)
	      System.out.println(toFind+"is found.");
	   else
	      System.out.println(toFind+"is not found.");   
	}
}


