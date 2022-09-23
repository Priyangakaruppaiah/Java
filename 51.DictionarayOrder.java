//Java program to sort elements in lexicographical order(Dictionary order)
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
	    String arr[]=new String[10];
			System.out.println("Enter the elements:");
			for(int i=0;i<=n;i++){
			    arr[i]=sc.nextLine();
			}
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n+1;++j){
		        if(arr[i].compareTo(arr[j])>0){
		            String temp=arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
		        }
		    }
		}
		System.out.println("In lexicographical order:");
		for(int i=0;i<n+1;i++){
		    System.out.println(arr[i]);
		    
		}
	}
}


