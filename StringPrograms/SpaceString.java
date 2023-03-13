//Java Program to replace the spaces of a string with a specific character
public class Main{    
    public static void main(String[] args) {    
        String str1="Remove white spaces";    
        str1 = str1.replaceAll("\\s+", "");    
        System.out.println("String after removing all the white spaces : " + str1);    
    }    
}
/*
OUTPUT:
String after removing all the white spaces : Removewhitespaces
*/
