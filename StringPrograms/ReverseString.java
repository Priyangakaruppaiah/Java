//Java Program to find Reverse of the string.
public class Main 
{    
    public static void main(String[] args) {    
        String string = "Dream big";    
        String reversedStr = "";    
        for(int i = string.length()-1; i >= 0; i--){    
            reversedStr = reversedStr + string.charAt(i);    
        }    
        System.out.println("Original string: " + string);    
        System.out.println("Reverse of given string: " + reversedStr);    
    }    
}  
/*
OUTPUT:
Original string: Dream big
Reverse of given string: gib maerD
*/
