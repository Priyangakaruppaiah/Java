import java.sql.Timestamp;    
import java.util.Date;    
 public class Main{    
       public static void main(String args[]){    
                Date date = new Date();  
                Timestamp ts=new Timestamp(date.getTime());  
                System.out.println(ts);                     
        }    
 }        
/*
OUTPUT:
2023-01-16 07:40:31.179
*/
