//Java program to lookup enum by string value
public class Main
{   
    public enum TextStyle{
       BOLD,ITALICS,UNDERLINE,STRIKETHROUGH 
    }
	public static void main(String[] args) {
	    String style="Bold";
	    TextStyle t1=TextStyle.valueOf(style.toUpperCase());
	    System.out.println(t1);
	}
}
