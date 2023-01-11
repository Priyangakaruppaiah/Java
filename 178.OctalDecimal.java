/Java Program to demonstrate the use of Integer.parseInt() method  
//for converting Octal to Decimal number  
public class Main{  
public static void main(String args[]){  
//Declaring an octal number  
String octalString="121";  
int decimal=Integer.parseInt(octalString,8);  
System.out.println(decimal);  
}} 
/*
OUTPUT:
81
*/
