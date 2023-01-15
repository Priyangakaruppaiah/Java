import java.sql.Timestamp;    
import java.util.Date;    
 public class Main{    
       public static void main(String args[]){    
                Timestamp ts=new Timestamp(System.currentTimeMillis());  
                Date date=new Date(ts.getTime());  
                System.out.println(date);                     
        }    
} 
/*
OUTPUT:
Sun Jan 15 12:45:02 GMT 2023
*/
