import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n1=sc.nextInt();
		int n2=n1;
		int r=0,s=0;
		while(n1>0){
		    r=n1%10;
		    s=s+(r*r*r);
		    n1=n1/10;
		}
		if(s==n2){
		    System.out.println(n2+"Armstrong number");
		}
		else{
		    System.out.println(n2+" Not a armstrong number");
		}
	
	}
}
/*
OUTPUT:
Enter the number:
153
153Armstrong number
*/



