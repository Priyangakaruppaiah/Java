import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if(i%2!=0)
            {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }
}
/*
OUTPUT:
my name is priyanga
ynm spiag
*/
