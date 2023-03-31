//Heapsort program in java
import java.util.Scanner;
public class Main
{
public static void heapify(int a[],int i,int n)
{ 
int l=2*i+1;
int r=2*i+2;
int temp,largest;
if(l<n && a[l]>a[i])
   largest=l;
else
   largest=i;
if(r<n && a[r]>a[largest])
   largest=r;
if(largest !=i)
 {
    temp=a[largest];
    a[largest]=a[i];
    a[i]=temp;
    heapify(a,largest,n);
  }
  }
 public static void bheap(int a[])
 { 
   for(int i=(a.length/2)-1;i>=0;i--)
    {
       heapify(a,i,a.length);
     }
    }
 public static void Sort(int a[])
 { 
    int temp,j,i;
    bheap(a);
    for( i=(a.length)-1; i>0;)
    {
      temp=a[0];
      a[0]=a[i];
      a[i]=temp;
      heapify(a,0,i--) ;
    }
 } 
 public static void printarray(int a[])
 {
   System.out.println();
   for(int i=0; i < a.length; i++)
   {
    System.out.print(a[i]+" ");
   }
  }
  public static void main(String[] args) 
  {
    int n, res,i;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number of elements in the array:");
    n=s.nextInt();
    int a[] = new int[n];
    System.out.println("Enter "+n+" elements ");
    for( i=0; i < n; i++)
    {
       a[i] = s.nextInt();
    }
    System.out.println( "elements in array ");
    printarray(a);
    Sort(a);
    System.out.println( "\nelements after sorting");
    printarray(a);
 
}
}
/*
OUTPUT:
https://javatutoring.com/java-programs/
Enter number of elements in the array:8
Enter 8 elements 
2
43
798
543
89
434
876
6  
elements in array 

2 43 798 543 89 434 876 6 
elements after sorting

2 6 43 89 434 543 798 876 
*/
