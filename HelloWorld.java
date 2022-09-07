import java.io.*;
public class HelloWorld
{
  public static void main(String args[])
  {
    DataInputStream reader=new DataInputStream(System.in);
    System.out.print("Enter the number");
    int number=reader.nextInt();
    System.out.println("You entered:"+number);
  }
  
}
