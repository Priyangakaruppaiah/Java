//Java program to calculate standard deviation
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entae the array");
		int n1=sc.nextInt();
		double a[]=new double[n1];
		System.out.println("Enter the elements:");
		for(int i=0;i<n1;i++){
			    a[i]=sc.nextInt();
			}
		double sd=calculate(a);
		System.out.format("Standard Deviation=%.6f",SD);
	}
	
	public static double calculate(double a[]){
	    double sum=0.0,StanDev=0.0;
	    int length=a.length;
	    for(double num:a) {
	        sum += num;
	  
	    double mean=sum/length;
	    for(double num:a){
	        StanDev+=Math.pow(num-mean,2);
	    }
	    return Math.sqrt( StanDev/length);
     }   
}

