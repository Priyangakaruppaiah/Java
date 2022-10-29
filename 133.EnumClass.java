enum Size{
    SMALL,LARGE,MEDIUM
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Access each enum class");
		 for(Size size : Size.values()) {
            System.out.print(size + " ");
         }
	}
}
