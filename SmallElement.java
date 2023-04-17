//Program to print the smallest element in an array
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total elements:");
        int n1=sc.nextInt();
        int[] arr=new int[n1];
         System.out.println("Enter numbber of elements");
        for(int i=0;i<n1;i++){
            arr[i]=sc.nextInt();
        }
       
        int small=arr[0];
        for(int i=0;i<n1;i++){
            if(arr[i]<small)
              small=arr[i];
        }
         System.out.println("Smallest element in array is:");
         System.out.println(small);
    }
}
/*
OUTPUT:
Enter total elements:
3
Enter numbber of elements
12
3
132
Smallest element in array is:
3
*/
