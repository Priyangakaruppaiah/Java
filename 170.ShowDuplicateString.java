// Display the duplicate elements in given string
public class Main
{
	public static void main(String[] args) {
	try{    
	String str = new String("kkett");
    int count = 0;
    char[] chars = str.toCharArray();
    System.out.println("Duplicate characters are:");
    for (int i=0;i<str.length();i++) {
        for(int j=i+1;i<str.length();j++) {
            if (chars[i] == chars[j]) {
                System.out.println(chars[j]);
                count++;
               
            }
        }
    }
	}
	catch(Exception e){
	    System.out.println(" ");
	}
	}
}
