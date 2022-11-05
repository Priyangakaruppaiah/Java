//Java Program to Calculate the difference between two sets
import java.util.HashSet;
import java.util.Set;
class Main {
  public static void main(String[] args) {
    Set<Integer> numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    numbers.add(6);
    numbers.add(7);
    
    System.out.println("Numbers: " + numbers);
    Set<Integer> primeNumbers = new HashSet<>();
    primeNumbers.add(2);
    primeNumbers.add(3);
    primeNumbers.add(5);
    primeNumbers.add(7);
    System.out.println("Prime Numbers: " + primeNumbers);
    numbers.removeAll(primeNumbers);
    System.out.println("Numbers without prime numbers: " + numbers);
    }
}
OUTPUT:
Numbers: [1, 2, 3, 4, 5, 6, 7]
Prime Numbers: [2, 3, 5, 7]
Numbers without prime numbers: [1, 4, 6]
