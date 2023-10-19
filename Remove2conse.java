import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = removeConsecutiveDuplicates(s);
        System.out.println(result);
    }

    private static String removeConsecutiveDuplicates(String s) {
        String str = "";
        char ch = '\0';
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=ch)
            {
                ch = s.charAt(i);
                str += ch;
            }
        }
        return str;
    }
}
/*
output:
aasdffgyty
asdfgyty
*/
