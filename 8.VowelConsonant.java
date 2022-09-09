//Check whether an alphabet is vowel or consonant 
import java.util.Scanner;
public class VowelConsonant
{
	public static void main(String[] args) {
	    Scanner reader=new Scanner(System.in);
	    System.out.println("Enter the character");
	    char cha=reader.next().charAt(0);
	    if(cha=='a' || cha=='e' || cha=='i' || cha=='o' || cha=='u'){
	        System.out.println(cha+"is vowel");
	       }
	    else{
	         System.out.println(cha+"is consonant");
	        }
	}
}
