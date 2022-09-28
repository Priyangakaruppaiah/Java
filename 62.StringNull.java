//Java program to check string is empty or null
import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String n1=sc.nextLine();
	    String n2=sc.nextLine();
	    String n3=sc.nextLine();
	    System.out.println("srt1 is"+isNullEmpty(n1));
	    System.out.println("srt1 is"+isNullEmpty(n2));
	    System.out.println("srt1 is"+isNullEmpty(n3));
	}  
	    public static String isNullEmpty(String n)
	    {
	       if(n==null){
	            return "NULL";
	        }
	       else if(n.isEmpty()){
	             return "EMPTY";
	        }
	        else{
	           return"neither Null nor Empty";
	          }
	   }
}

