//Java Program to Get the relative path from two absolute paths
import java.io.File;
import java.net.URI;

class Main {
  public static void main(String[] args) {

    try {

     
      File absolutePath1 = new File("C:\\Users\\Desktop\\Programiz\\Java\\Time.java");
      System.out.println("Absolute Path1: " + absolutePath1);
      File absolutePath2 = new File("C:\\Users\\Desktop");
      System.out.println("Absolute Path2: " + absolutePath2);
      URI path1 = absolutePath1.toURI();
      URI path2 = absolutePath2.toURI();
      URI relativePath = path2.relativize(path1);
      String path = relativePath.getPath();
      System.out.println("Relative Path: " + path);
      }
      catch (Exception e) {
         e.getStackTrace();
    }
  }
}

