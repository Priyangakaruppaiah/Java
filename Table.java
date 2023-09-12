import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(k+" x "+i+" = "+k*i);
        }
    }
}
/*
OUTPUT:
5
4
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20

*/
