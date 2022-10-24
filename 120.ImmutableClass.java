// Java program to create immutable class
final class Immutable {
  private String name;
  private int date;

  Immutable(String name, int date) {
    this.name = name;
    this.date = date;
  }
  public String getName() {
    return name;
  }

  public int getDate() {
    return date;
  }

}
class Main {
  public static void main(String[] args) {
    Immutable obj = new Immutable("Programiz", 2011);
    System.out.println("Name: " + obj.getName());
    System.out.println("Date: " + obj.getDate());
  }
}
