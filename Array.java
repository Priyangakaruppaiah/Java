import java.util.Scanner;  
public class Main
 {  
   public static void main(String[] args)   
    {  
       int n;  
       Scanner sc=new Scanner(System.in);  
       System.out.print("Enter the number of elements you want to store: ");  
       n=sc.nextInt();  
       int[] array = new int[n];  
       System.out.println("Enter the elements of the array: ");  
       for(int i=0; i<n; i++)  
       {  
         array[i]=sc.nextInt();  
       }        
       System.out.println("Array elements are: ");  
       for (int i=0; i<n; i++)   
       {  
         System.out.println(array[i]);  
       }  
    }  
}  
/*
OUTPUT:
Enter the number of elements you want to store: 4
Enter the elements of the array: 
23
34
45
56
Array elements are: 
23
34
45
56

*/
