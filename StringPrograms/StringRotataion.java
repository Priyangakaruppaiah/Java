//Java Program to determine whether one string is a rotation of another
public class Main   
{    
    public static void main(String[] args) {    
        String str1 = "abcde", str2 = "deabc";    
        if(str1.length() != str2.length()){    
            System.out.println("Second string is not a rotation of first string");    
        }    
        else {    
            str1 = str1.concat(str1);    
            if(str1.indexOf(str2) != -1)    
                System.out.println("Second string is a rotation of first string");    
            else    
                System.out.println("Second string is not a rotation of first string");    
        }    
    }    
} 
/*
OUTPUT:
Second string is a rotation of first string
*/
