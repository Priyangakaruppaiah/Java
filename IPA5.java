/*

Create a class Book with below attributes

id - int

pages - int

title - String

author - String

price - double

The above attributes should be private, write getters and setters and parameterized constructor as required.

Create a class Solution with main method
--------------------------------------------
Implement two static methods - findBookWithMaximumPrice and searchBookByTitle in Solution class.

findBookWithMaximumPrice :
=============================
Create a static method findBookWithMaximumPrice in the Solution class. This method will take array of Book objects and 
returns the Book object having the maximum Price if found else return null if not found.

searchBookByTitle :
=============================
Create a static method searchBookByTitle in the Solution class. This method will take array of Book objects and Title as 
input and returns the Book object having the mentioned Title if found else return null if not found.

These methods should be called from the main method.

write code to perform the following tasks.

1. Take necessary input variable and call findBookWithMaximumPrice. For this method - The main method should print the Book
 object with the maximum of mentioned attribute as it is if the returned value is not null, or it should print 
 "No Book found with mentioned attribute."

2. Take necessary input variable and call searchBookByTitle. For this method - The main method should print the Book object 
details as it is, if the returned value is not null or it should print "No Book found with mentioned attribute."

The above mentioned static methods should be called from the main method. Also write the code for accepting the inputs and 
printing the outputs. Don't use any static test or formatting for printing the result. Just invoke the method and print the
result.

All String comparison needs to be in case sensitive.

*/
package IPA9;
import java.util.*;

public class IPA9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] bk = new Book[4];
        for (int i = 0; i < bk.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            int b = sc.nextInt();sc.nextLine();
            String c = sc.nextLine();
            String d = sc.nextLine();
            double e = sc.nextDouble();sc.nextLine();

            bk[i] = new Book(a,b,c,d,e);
        }
        String name = sc.nextLine();

        Book[] ans1 = findBookWithMaximumPrice(bk);
        if(ans1!=null)
        {
            for (int i = 0; i < ans1.length; i++) {
                System.out.println(ans1[i].getId()+" "+ans1[i].getTitle());
            }
        }
        else
        {
            System.out.println("No Book found with mentioned attribute.");
        }
        Book ans2 = searchBookByTitle(bk, name);
        if(ans2!=null)
        {
            System.out.println(ans2.getId());
            System.out.println(ans2.getPages());
        }
    }
    public static Book[] findBookWithMaximumPrice(Book[] b)
    {
        Book[] details = new Book[0];
        double max = 0;
        for (int i = 0; i < b.length; i++)
        {
            if(b[i].getPrice()>=max)
            {
                max = b[i].getPrice();
            }
        }
        for (int i = 0; i < b.length; i++) {
            if(b[i].getPrice()==max)
            {
                details = Arrays.copyOf(details, details.length+1);
                details[details.length-1]=b[i];
            }
        }
        if(details.length>0)
        {
            return details;
        }
        else{
            return null;
        }
    }
    public static Book searchBookByTitle(Book[] b, String n)
    {
        for (int i = 0; i < b.length; i++) {
            if(b[i].getTitle().equalsIgnoreCase(n))
            {
                return b[i];
            }
        }
        return null;
    }
}
class Book
{
    private int id, pages;
    private String title, author;
    private double price;

    public Book(int id, int pages, String title, String author, double price)
    {
        this.id = id;
        this.pages = pages;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getPages()
    {
        return pages;
    }
    public void setPages(int pages)
    {
        this.pages = pages;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
}
