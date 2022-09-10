//Java programto find roots of a quadratic equation
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number a:");
	    double a=sc.nextDouble();
	     System.out.println("Enter the number b:");
	    double b=sc.nextDouble();
	     System.out.println("Enter the number c:");
	    double c=sc.nextDouble();
	    double root1,root2;
	    double determinant=b*b-4*a*c;
	    if(determinant>0){
	        root1=(-b+Math.sqrt(determinant))/(2*a);
	        root2=(-b-Math.sqrt(determinant))/(2*a);
	        System.out.format("root1=%.2f and root2=%.2f",root1,root2);
	       
	    }
	    else if(determinant==0){
	         root1=root2=-b/(2*a);
	        System.out.format("root1=root2=%.2f;",root1);
	        
	    }
	    else{
	        double real=-b/(2*a);
	        double imaginary = Math.sqrt(-determinant)/(2*a);
	        System.out.format("root1=%.4f+%.4fi",real,imaginary);
	        System.out.format("\n root2=%.4f-%.5fi",real,imaginary);
	    }
	 }
}
