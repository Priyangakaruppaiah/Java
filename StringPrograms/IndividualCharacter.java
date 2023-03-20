//Java Program to separate the Individual Characters from a String
public class Main 
{  
    public static void main(String[] args) {  
        String string = "characters ";  
        System.out.println("Individual characters from given string: ");  
        for(int i = 0; i < string.length(); i++){  
            System.out.print(string.charAt(i) + " ");  
        }  
    }  
} 
/*
OUTPUT:
Individual characters from given string: 
c h a r a c t e r s   
*/
