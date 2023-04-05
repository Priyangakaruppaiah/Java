//Cmpare two objects in java
public class Main
{  
public static void main(String[] args)   
{  

Double x = new Double(123.45555);  

Long y = new Long(9887544);  

System.out.println("Objects are not equal, hence it returns " + x.equals(y));  
System.out.println("Objects are equal, hence it returns " + x.equals(123.45555));  
}  
}
/*
OUTPUT:
Objects are not equal, hence it returns false
Objects are equal, hence it returns true
*/
