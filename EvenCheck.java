/* Count number of even digit in a number
 * If the count greater than or equal to 3, then print "True" otherwise "False"
 */
import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        int count = 0;
  String num = sc.nextLine();
        for (int i = 0; i < num.length(); i++) 
        {
            if(Integer.parseInt(String.valueOf(num.charAt(i)))%2==0)
            {
                count++;
            }
        }
        if(count>=3)
        {
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}
