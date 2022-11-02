//java Program to Update value of HashMap using key
import java.util.HashMap;
class Main {
  public static void main(String[] args) {

    HashMap<String, Integer> numbers = new HashMap<>();
    numbers.put("First", 1);
    numbers.put("Second", 2);
    numbers.put("Third", 3);
    System.out.println("HashMap: " + numbers);
    int value = numbers.get("Second");
    value = value * value;
    numbers.put("Second", value);
    System.out.println("HashMap with updated value: " + numbers);
  }
}
