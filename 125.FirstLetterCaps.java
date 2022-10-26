// Java program to make the first letter of a String capital
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String name=sc.nextLine();
   String firstLetter = name.substring(0, 1);
   String remainingLetters = name.substring(1, name.length());
   firstLetter = firstLetter.toUpperCase();
   name = firstLetter + remainingLetters;
   System.out.println("Name: " + name);

  }
}
