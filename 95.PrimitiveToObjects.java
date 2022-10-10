//Java program to convert primitive types to objects and vice versa
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter integer:");
	    int n1=sc.nextInt();
	     System.out.println("Enter double:");
	    double n2=sc.nextDouble();
	     System.out.println("Enter boolean:");
	    boolean n3=sc.nextBoolean();
	    Integer obj1 = Integer.valueOf(n1);
	     Double obj2 = Double.valueOf(n2);
	     Boolean obj3 = Boolean.valueOf(n3);
	    if(obj1 instanceof Integer){
	        System.out.println("an object of integer is created");
	    }
	     if(obj2 instanceof Double){
	        System.out.println("an object of double is created");
	    }
	     if(obj3 instanceof Boolean){
	        System.out.println("an object of boolean is created");
	    }
		
	}
}

