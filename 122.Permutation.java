//Java Program to Compute all the permutations of the string
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
  public static Set<String> getPermutation(String str) {
     Set<String> permutations = new HashSet<String>();
     if (str == null) {
      return null;
    } else if (str.length() == 0) {
     
      permutations.add("");
      return permutations;
    }
    char first = str.charAt(0);
    String sub = str.substring(1);
    Set<String> words = getPermutation(sub);
     for (String strNew : words) {
      for (int i = 0;i<=strNew.length();i++){
           permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
      }
    }
    return permutations;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String data = input.nextLine();
    System.out.println("Permutations of " + data + ": \n" + getPermutation(data));
    }
    }
