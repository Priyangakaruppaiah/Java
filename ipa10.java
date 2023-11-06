/*
Create a class Phone with below attributes: 

phoneId - int 
os - String 
brand - String 
price - int

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with main method.

Implement two static methods - findPriceForGivenBrand and getPhoneIdBasedOnOs in Solution class.

findPriceForGivenBrand method: 
----------------------------------
This method will take two input parameters - array of Phone objects and string 
parameter brand. The method will return the sum of the price attribute from phone objects for the brand passed 
as parameter. If no phones with the given brand is present in the array of phone objects, then the method should 
return 0.

getPhoneIdBasedOnOs method: 
----------------------------------
This method will take a String parameter os, along with the array of Phone objects. 
The method will return the phone object, if the input String parameter matches with the os attribute of the phone 
object and its price attribute is greater than or equal to 50000. If any of the conditions are not met, then the 
method should return null.

Note : No phone object would have the same value for os attribute. All phone object would have the price greater than 0. 
All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.

For findPriceForGivenBrand method - The main method should print the price as it is if the returned price is greater 
than 0, or it should print "The given Brand is not available".

For getPhoneIdBasedOnOs method - The main method should print the phoneId of the returned phone object. If the returned 
value is null then it should print "No phones are available with specified os and price range".

Before calling these static methods in main, use Scanner object to read the values of four Phone objects referring 
attributes in the above mentioned attribute sequence. Next, read the value for brand and os.

Input
--------------
111
iOS
Apple
30000
222
android
Samsung
50000
333
Symbian
HTC
12000
444
Paranoid
HTC
89000
Blackberry
aNdRoid

Output
------------------
The given Brand is not available
222
*/
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] ph = new Phone[4];
        for (int i = 0; i < ph.length; i++) 
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();

            ph[i] = new Phone(a,b,c,d);
        }
        String br = sc.nextLine();
        String os = sc.nextLine();
        int ans1 = findPriceForGivenBrand(ph,br);
        if(ans1!=0)
        {
            System.out.println(ans1);
        }
        else{
            System.out.println("The brand is not available");
        }

        int ans2 = getPhoneIdBasedOnOs(ph,os);
        if(ans2!=0)
        {
            System.out.println(ans2);
        }
        else
        {
            System.out.println("No phones are available with specified os and price range");
        }
    }
    public static int findPriceForGivenBrand(Phone[] p, String br)
    {
        int sum = 0;
        for (int i = 0; i < p.length; i++) {
            if(p[i].getBrand().equalsIgnoreCase(br))
            {
                sum += p[i].getPrice();
            }
        }
        return sum;   
    }
    public static int getPhoneIdBasedOnOs(Phone[] p,String os)
    {
        for (int i = 0; i < p.length; i++) {
            if(p[i].getOs().equalsIgnoreCase(os) && p[i].getPrice()>=50000)
            {
                return p[i].getId();
            }
        }
        return 0;
    }
}
class Phone
{
    int id,price;
    String os,brand;

    public Phone(int id, String os, String brand, int price)
    {
        this.id = id;
        this.os = os;
        this.brand=brand;
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
    public String getOs()
    {
        return os;
    }
    public void setOs(String os)
    {
        this.os = os;
    }
    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
}
