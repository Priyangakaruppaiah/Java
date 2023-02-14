import java.util.*; 
import java.util.regex.Pattern;
public class Main 
{  
public static void main(String[] arg)  
{  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter a string: ");  
String  str=sc.nextLine();    
Pattern pattern = Pattern.compile("\\s");
String[] temp = pattern.split(str);
String result = " ";
for (int i = 0; i < temp.length; i++) {
    if (i == temp.length - 1)
        result = temp[i] + result;
    else
        result = " " + temp[i] + result;
    }
    System.out.println(result); 
}
}
/*
OUTPUT:
Enter a string: computer science and engineering
engineering and science computer 
*/
  
    



