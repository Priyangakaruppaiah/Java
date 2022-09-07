//get 2 numbers from user and add.
import java.io.*;
public class add2numbers
{
  public static void main(String args[])
  {
    int num1,num2,sum;
    DataInputStream reader=new DataInputStream(System.in);
    System.out.println("Enter the first number:");
    num1=reader.nextInt();
    System.out.println("Enter second number:");
    num2=reader.nextInt();
    reader.close();
    sum=num1+num2;
    System.out.println("Sum of these numbers:"+sum);
  }
}  
