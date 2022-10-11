//Java program to find the search element in binary search
import java.util.Scanner;
class Main{  
 public static void binarySearch(int arr[], int first, int last, int key){  
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }else if ( arr[mid] == key ){  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }  
 }  
 public static void main(String args[]){  
      
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
        System.out.println("Enter the search number");
       int key=sc.nextInt();
        int last=arr.length-1;  
        binarySearch(arr,0,last,key);  
 }
}
