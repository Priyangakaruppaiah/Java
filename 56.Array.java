//Java program to print an array
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		System.out.println("entae the array");
		int n1=sc.nextInt();
		int a[]=new int[n1];
			System.out.println("Enter the elements:");
			for(int i=0;i<n1;i++){
			    a[i]=sc.nextInt();
			}
			for(int element:a){
			    System.out.println(element);
			}
	}
}



