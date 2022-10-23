//Java program to create an enum class
enum Size{
  SMALL, MEDIUM, LARGE, EXTRALARGE;

  public String getSize() {
  switch(this) {
    case SMALL:
      return "small";

    case MEDIUM:
      return "medium";

    case LARGE:
      return "large";

    case EXTRALARGE:
      return "extra large";
    default:
       return null;
     }
  }

  public static void main(String[] args) {

    System.out.println("The size of Pizza I get is " + Size.SMALL.getSize());
    System.out.println("The size of Pizza I want is " + Size.LARGE.getSize());
  }
}
  
