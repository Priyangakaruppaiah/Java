//Java program to convert Array to Set(HashSet) and viceversa
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String[] array={"a","b","c"};
		Set<String> set = new HashSet<>(Arrays.asList(array));
		System.out.println("Set: " + set);
	}
}
