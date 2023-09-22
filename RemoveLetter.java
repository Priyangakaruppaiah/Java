import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ch = sc.nextLine();
        String s = str.replace(ch,"");
        System.out.println(s);
    }
}
/*
OUTPUT:
priyang       
i
pryang
*/
