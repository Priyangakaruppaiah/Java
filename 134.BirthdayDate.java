import java.util.Scanner;
import java.time.*;

public class Main {
   public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter birthDate");
    int birthDate=sc.nextInt();
    Month birthMonth = Month.OCTOBER;
  
    LocalDate currentDate = LocalDate.now();
    System.out.println("Todays Date: " + currentDate);
    
    int date = currentDate.getDayOfMonth();
    Month month = currentDate.getMonth();

    if(date == birthDate && month == birthMonth) {
      System.out.println("HAPPY BIRTHDAY TO YOU !!");
    }
     else {
      System.out.println("Today is not my birthday.");
    }
   }
}

