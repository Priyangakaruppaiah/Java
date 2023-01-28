class Emp{}  
public class Main{  
public static void main(String args[]){  
Emp e=new Emp();  
String s=e.toString();  
String s2=String.valueOf(e);  
System.out.println(s);  
System.out.println(s2);  
}}
/*
OUTPUT:
Emp@3b22cdd0
Emp@3b22cdd0
*/

