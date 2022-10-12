//Java program to pass lambda expression as a method function
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<String> languages = new ArrayList<>();
	    languages.add("java");
	    languages.add("Python");
	    languages.add("C");
	    languages.add("C++");
		System.out.println("ArrayList:"+languages);
		languages.replaceAll(e -> e.toUpperCase());
		System.out.println("Updated ArrayList :"+languages);
	}
}
