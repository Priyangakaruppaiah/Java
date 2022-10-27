// Implement the switch statement on Strings
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the language:");
	String language=sc.nextLine();
	switch(language){
	case "Java":
	    System.out.println(language + " is famous for enterprise applications.");
        break;
      
    case "Python": 
        System.out.println(language + " is famous for famous for ML and AI");
        break;
    case "JavaScript": 
        System.out.println(language + " is famous for  famous for frontend and backend.");
        break;
    case "C":     
        System.out.println(language + " is to create many types of applications and operating systems");
        break;
    default:
        System.out.println(language + " not found on record.");
        break;       
	}
	}
}
OUTPUT:
Enter the language:
C
C is to create many types of applications and operating systems
