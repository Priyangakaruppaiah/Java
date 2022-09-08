//Java program to Swap two numbers
import java.util.scanner;
public class SwapNumbers
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number:");
    float num1=sc.nextFloat();
    System.out.println("Enter the second number:");
    float num2=sc.nextFloat();
    System.out.println("--Before Swap--");
    System.out.println("First Number="+num1);
    System.out.println("Second Number="+num2);
    num1=num1-num2;
    num2=num1+num2;
    num1=num2-num1;
    System.out.println("--After Swap--");
    System.out.println("First Number="+num1);
    System.out.println("Second Number="+num2);
  }
}  
    
                       
                       
    
    
