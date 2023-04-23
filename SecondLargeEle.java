//Program to print the second largest element in an array
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[] arr=new int[n1];
        for(int i=0;i<n1;i++){
            arr[i]=sc.nextInt();
        }
         System.out.println("Second largest"+SecondLargest(n1,arr));
    }
    public static int SecondLargest(int n1,int arr[]){ 
        for(int i=0;i<n1;i++){
            for(int j=i+1;j<n1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
      return arr[n1-2];
    }
    
}
/*
OUTPUT:
4
12
15
17
11
Second largest15
*/
