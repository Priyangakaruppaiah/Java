import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int sum=0;
        for (int i = 1; i <= k; i++) {
            sum+=i;
        }
        System.out.println("sum of " +k +" natutal number is "+sum);
    }
}
/*
OUTPUT:
6
sum of 6 natutal number is 21
*/
