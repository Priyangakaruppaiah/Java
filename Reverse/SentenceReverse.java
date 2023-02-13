import java.util.*;  
public class Main 
{  
public static void main(String[] arg)  
{  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter a string: ");  
String  str=sc.nextLine();    
 String r="";  
for(int i=str.length();i>0;--i)      
{  
r=r+(str.charAt(i-1));   
}  
System.out.println(r);  
}  
}  
/*
OUTPUT:
Enter a string: Happy Good Morning 13-02-2022
2202-20-31 gninroM dooG yppaH
*/
