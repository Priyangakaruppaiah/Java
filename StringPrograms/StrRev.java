//How to reserve a string in Java without using reverse functio
import java.util.Scanner;  
 public class Main  
 {  
  public static void main(String args[])  
  {  
    String s;  
    Scanner sc=new Scanner(System.in);  
    System.out.print("Enter a String: ");  
    s=sc.nextLine();                   
    System.out.print("After reverse string is: ");  
    for(int i=s.length();i>0;--i)                 
    {  
        System.out.print(s.charAt(i-1));          
    }  
  }  
 }  
/*
OUTPUT:
Enter a String: flower garden
After reverse string is: nedrag rewolf

*/
