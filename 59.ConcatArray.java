//Java program to concatenate two arrays
import java.util.Scanner;
import java.util.Arrays;
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
		System.out.println("entae the array");	
		int n2=sc.nextInt();	
		int b[]=new int[n2];
			System.out.println("Enter the elements:");
			for(int i=0;i<n2;i++){
			    b[i]=sc.nextInt();
			}
		int alen=a.length;
		int blen=b.length;
		int[] result=new int[alen+blen];
		System.arraycopy(a,0,result,0,alen);
		System.arraycopy(b,0,result,alen,blen);
		System.out.println(Arrays.toString(result));
		
	}
}


