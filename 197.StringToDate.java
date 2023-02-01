// Java program to convert string to Date
import java.text.SimpleDateFormat;  
import java.util.Date;  
public class Main{  
public static void main(String[] args)throws Exception {  
    String sDate1="31/12/1998";  
    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
    System.out.println(sDate1+"\t"+date1);  
}  
}
/*
OUTPUT:
31/12/1998      Thu Dec 31 00:00:00 GMT 1998
*/
