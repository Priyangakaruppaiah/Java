// Find the number is positive or negative
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        num=sc.nextInt();
        if(num>0){
            System.out.println("The number is positive");
        }
        else if(num<0){
            System.out.println("The number is Negative");
        }
    }
}
/*
OUTPUT:
Enter a number:
5
The number is positive
*/
