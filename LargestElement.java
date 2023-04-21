//Program to print the largest element in an array
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[] arr=new int[n1];
        for(int i=0;i<n1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n1;i++){
        System.out.println(arr[i]);
        }
        int max=arr[0];
        for(int i=0;i<n1;i++){
            if(arr[i]>max)
               max=arr[i];
        }
         System.out.println(max);
    }
}
/*
OUTPUT:
3
12
122
11
12
122
11
122
*/
