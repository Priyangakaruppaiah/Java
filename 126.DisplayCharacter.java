// Loop through each character of a string using for loop
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  
   Scanner sc=new Scanner(System.in);
   String name=sc.nextLine();
    System.out.println("Characters in " + name + " are:");
    for(int i = 0; i<name.length(); i++) {
    char a = name.charAt(i);
    System.out.print(a + "  ");
    }
  }
}
