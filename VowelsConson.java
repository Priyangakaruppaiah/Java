//Get the input as string and count vowels and consonants
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        input = input.toLowerCase();
        int vowelCount=0,consonantCount= 0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)>='a' && input.charAt(i)<='z'){
                if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u')
                    vowelCount += 1;
                else
                    consonantCount += 1;
            }
        }
        System.out.println("Number of Vowels: "+vowelCount);
        System.out.println("Number of Consonants: "+consonantCount);
    }
}
/*
OUTPUT:
good morning
Number of Vowels: 4
Number of Consonants: 7
*/
