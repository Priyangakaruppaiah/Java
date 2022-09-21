//Java program to find largest element of an array
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
		int m=a[0];
		for(int i=1;i<=n1-1;i++){
		    if(m<a[i]){
		        m=a[i];
		    }
		}
		System.out.println(m +"maximum number");
		
	}
}

