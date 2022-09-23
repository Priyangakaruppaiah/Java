//Java program to count the number of vowels and consonants in a sentence.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		int vowels=0,consonants=0,digits=0,spaces=0;
		str=str.toUpperCase();
		for(int i=0;i<str.length();++i){
		    char ch=str.charAt(i);
		    if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
		        ++vowels;
		    }
		    else if(ch>='A' && ch<='Z'){
		        ++consonants;
		    }
		    else if(ch>='0'  && ch>='9'){
		        ++digits;
		    }
		    else if(ch==' '){
		        ++spaces;
		    }
		}
		System.out.println("vowels:" +vowels);
		System.out.println("consonants:" +consonants);
		System.out.println("digits:" +digits);
		System.out.println("white spaces:" +spaces);
	}
}

