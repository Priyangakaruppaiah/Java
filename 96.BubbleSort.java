//Java program to implement bubble sort algorithm
import java.util.Scanner;
 class Main{  
    public static void bubbleSort(int[] a) {  
        int n = a.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(a[j-1] > a[j]){  
                                 //swap elements  
                                 temp = a[j-1];  
                                 a[j-1] = a[j];  
                                 a[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
     public static void main(String[] args) {  
                //int arr[] ={3,60,35,2,45,320,5};
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number:")
                int n1=sc.nextInt();
                int a[]=new int[n1];
                for( int i=0;i<n1;i++){
                   	a[i]=sc.nextInt();
                }
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < a.length; i++){  
                        System.out.print(a[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(a);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < a.length; i++){  
                        System.out.print(a[i] + " ");  
                }  
   
        }  
}  




