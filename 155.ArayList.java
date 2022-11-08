//Java Program to Iterate over ArrayList using Lambda Expression
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
   
    ArrayList<String> languages = new ArrayList<>();

    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");

    System.out.print("ArrayList: ");

    languages.forEach((e) -> {
      System.out.print(e + ", ");
    });
  }
}
