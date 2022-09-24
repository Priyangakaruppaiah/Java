//Java Program to Add Two Complex Numbers by Passing Class to a Function
import jva.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scaner sn=new Scanner(System.in);
		double real=sc.nectDouble();
		double img=sc.nextDouble();
		public Complex(double real,double img){
		    this.real=real;
		    this.img=img;
		    
		}
		public static void main(String args[]){
		    Complex n1=new Complex(2.3,4.5);
		            n2=new Complex(3.4,5.0);
		            temp;
		    temp=add(n1,n2);
		    System.out.println("Sum = %.1f + %.1fi",temp.real,temp.img);
		}
		public static Complex add(Complex n1,Complex n2){
		    Complex temp=new Complex(0.0,0.0);
		    temp.real=n1.real+n2.real;
		    temp.img=n1.img+n2.img;
		    return(temp);
		}
	}
}

