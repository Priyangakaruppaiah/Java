import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        String large = "";
        for (int i = 0; i < arr.length; i++) 
        {
             if(arr[i].length()>large.length())
             {
                 large = arr[i];
             }
        }
        System.out.println("The largest string is: "+large);
     } 
}
/*
i am priyanga karuppaiah
The largest string is: karuppaiah
*/
