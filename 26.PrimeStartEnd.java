//Find the prime number between n1 to n2
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number n1:");
		int n1=sc.nextInt();
		System.out.println("Enter the number n2:");
		int n2=sc.nextInt();
		while (n1 < n2) {
            boolean flag =false;
            for(int i = 2; i <= n1/2; ++i) {
                if(n1 % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag && n1 != 0 && n1 != 1)
                System.out.print(n1 + " ");
            ++n1;
        }
  }
}

