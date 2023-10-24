import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String v = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            if((i+1)%2!=0 && !v.contains(Character.toString(s.charAt(i))) && s.charAt(i)!=' ')
            {
                System.out.print(s.charAt(i));
            }
        }    
    }
}
/*
OUTPUT:
Arijit Ghosh
hs
*/
