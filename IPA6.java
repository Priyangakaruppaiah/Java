/*
Create a class Hotel with the below attributes:
 
hotelId - int
hotelName - String
dateOfBooking – String (in the format dd-mon-yyyy)
noOfRoomsBooked – int
wifiFacility – String
totalBill- double
The above attributes should be private, write getters, setters and parameterized constructor as required.
Create class Solution with main method.
 
 Implement two static methods – noOfRoomsBookedInGivenMonth and searchHotelByWifiOption in Solution class.
 
noOfRoomsBookedInGivenMonth method:
This method will take two input parameter - array of Hotel objects and a String parameter.
The method will return the total numbers of rooms booked from array of Hotel objects for the given month(String parameter passed).
If no rooms are booked for the given month in the array of Hotel objects, then the method should return 0.

searchHotelByWifiOption method:
This method will take two input parameter - array of Hotel objects and a String parameter
The method will return Hotel object with second highest totalbill, from the array of Hotel objects where wifiFacility attribute 
matches with the given wifi facility(String parameter passed).
If no Hotel with the given wifi option is present in the array of Hotel objects, then the method should return null.
 
Note : 
No two Hotel object would have the same hotelId.
No two Hotel object would have the same totalbill.
The Array either has at least two objects with specified wifi option OR  no object with specified wifi option. 
All the searches should be case insensitive. 
dateOfBooking is stored in the format dd-mon-yyyy(eg. 01-Jan-2022)
 
The above mentioned static methods should be called from the main method. 
 
For noOfRoomsBookedInGivenMonth method - The main method should print the total number of booked rooms as it is, 
if the returned value is greater than 0, else it should print "No rooms booked in the given month"
 
For searchHotelByWifiOption method - The main method should print the hotelId from the returned Hotel object if the returned value is not null. 
If the returned value is null then it should print "No such option available".
 
Before calling these static methods in main, use Scanner object to read the values of four Hotel objects referring attributes in the above mentioned attribute sequence. 
Next, read the value of two String parameters for capturing the month and wifi option .

*/
import java.util.*;
public class IPA8
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Hotel[] h = new Hotel[4];
        for (int i = 0; i < h.length; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();
            double f = sc.nextDouble();sc.nextLine();

            h[i]=new Hotel(a,b,c,d,e,f);
        }
        String month = sc.nextLine();
        String wf = sc.nextLine();
        int ans1 = noOfRoomsBookedInGivenMonth(h, month);
        if(ans1!=0)
        {
            System.out.println(ans1);
        }
        else{
            System.out.println("No rooms booked in the given month");
        }
        int ans2 = searchHotelByWifiOption(h, wf);
        if(ans2!=0)
        {
            System.out.println(ans2);
        }
        else{
            System.out.println("No such option available");
        }
    }
    public static int noOfRoomsBookedInGivenMonth(Hotel[] h, String m)
    {
        int count = 0;
        for (int i = 0; i < h.length; i++) 
        {
            if(h[i].getDate().contains(m))
            {
                count = count + h[i].getRoom();
                return count;
            }
        }
        return 0;
    }

    public static int searchHotelByWifiOption(Hotel[] h, String w)
    {
        int[] id = new int[0];
        for (int i = 0; i < h.length; i++) {
            if(h[i].getWifi().equalsIgnoreCase(w))
            {
                id = Arrays.copyOf(id, id.length+1);
                id[id.length-1]=h[i].getId();
                Arrays.sort(id);
            }
        }
        if(id.length>0)
        {
            return id[id.length-2];
        }
        else
        {
            return 0;
        }
    }
}  
class Hotel{
    private int id;
    private String name;
    private String date;
    private int room;
    private String wifi;
    private double bill;

    public Hotel(int id, String name, String date, int room, String wifi, double bill)
    {
        this.id = id;
        this.name = name;
        this.date = date;
        this.room = room;
        this.wifi = wifi;
        this.bill = bill;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getDate()
    {
        return date;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    public int getRoom()
    {
        return room;
    }
    public void setRoom(int room)
    {
        this.room = room;
    }
    public String getWifi()
    {
        return wifi;
    }
    public void setWifi(String wifi)
    {
        this.wifi = wifi;
    }
    public double getBill()
    {
        return bill;
    }
    public void setBill(double bill)
    {
        this.bill = bill;
    }
}
