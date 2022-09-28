//Java program to get current date/time
import java.time.LocalDateTime;
public class Main
{
	public static void main(String[] args) {
	    LocalDateTime current=LocalDateTime.now();
		System.out.println("Current date and time is:"+current);
	}
}
