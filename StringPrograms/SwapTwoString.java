//Java Program to swap two string variables without using third or temp variable.
public class Main    
{    
    public static void main(String[] args) {    
        String str1 = "Good ", str2 = "morning ";    
         System.out.println("Strings before swapping: " + str1 + " " + str2);    
        str1 = str1 + str2;    
        str2 = str1.substring(0, (str1.length() - str2.length()));    
        str1 = str1.substring(str2.length());    
        System.out.println("Strings after swapping: " + str1 + " " + str2);    
    }    
}
/*
OUTPUT:
Strings before swapping: Good  morning 
Strings after swapping: morning  Good 
*/
