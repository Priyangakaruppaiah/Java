import java.util.*;
 public class Main
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Can't reverse");
        }
        else
        {
            int sum=0;
            while(num>0)
            {
                int rem = num%10;
                sum = sum*10 + rem;
                num = num/10;
            }
            System.out.println("The reverse of the number : "+sum);
        }
    }
 }
/*
OUTPUT:
235
The reverse of the number : 532

24
can't revers
  */

  
