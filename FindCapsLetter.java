import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        System.out.println("The words starts with capital letter: ");
        for (int i = 0; i < s.length; i++) {
            if(s[i].charAt(0)>='A' && s[i].charAt(0)<='Z')
            {
                System.out.println(s[i]);
            }
        }
    }
}
/*
OUTPUT:
My name Is Priyanga K
The words starts with capital letter: 
My
Is
Priyanga
K
*/
