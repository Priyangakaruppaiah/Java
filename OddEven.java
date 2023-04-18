//Java Program to print Odd and Even Numbers from an Array
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter total elements:");
    int n1=sc.nextInt();
    int[] arr=new int[n1];
    System.out.println("Enter number of elements:");
    for(int i=0;i<n1;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Even Elements:");
    for(int i=0;i<n1;i++){
        if(arr[i]%2==0)
        System.out.println(arr[i]);
    }
    System.out.println("Odd Elements:");
    for(int i=0;i<n1;i++){
        if(arr[i]%2!=0)
        System.out.println(arr[i]);
    }
  }

}
/*
OUTPUT:
Enter total elements:
7
Enter number of elements:
1
2
3
4
5
6
7
Even Elements:
2
4
6
Odd Elements:
1
3
5
7
*/
