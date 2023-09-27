import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
            c=c+1;
            
        }
        System.out.println("Total words in string  "+c);
        
    }
}
/*
OUTPUT:
Enter the String:
My name is Priyanga Karuppaiah
Total words in string  4
*/
