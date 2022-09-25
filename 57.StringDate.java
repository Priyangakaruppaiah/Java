//Java program to convert string to date
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the date format:y-m-d");
	String str=sc.nextLine();
	LocalDate date=LocalDate.parse(str,DateTimeFormatter.ISO_DATE);
	System.out.println(date);
	
	}
}

