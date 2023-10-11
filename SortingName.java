import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];
        String name = "";
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = i+1; j < str.length; j++) {
                if(str[i].compareTo(str[j])>0)
                {
                    name = str[i];
                    str[i]=str[j];
                    str[j]=name;
                } 
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
/*
INPUT:
priyanga
abi
kavya
sneha
mani

OUTPUT:
abi
kavya
mani
priyanga
sneha
*/
