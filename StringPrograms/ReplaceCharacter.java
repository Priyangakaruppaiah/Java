//Java Program to replace the spaces of a string with a specific character
public class Main    
{    
    public static void main(String[] args) {    
        String string = "Once in a blue moon";    
        char ch = '-';    
        string = string.replace(' ', ch);    
        System.out.println(string);    
    }    
}
/*
OUTPUT:
Once-in-a-blue-moon
*/
