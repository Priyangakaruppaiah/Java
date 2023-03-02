/*TRAVEL AGENCIES MANAGEMENT QUESTIONS:

create a class TravelAgencies with below attributes:
regNo-int
agencyName-String
packageType-String
price-int
flightFacility-boolean

  write getters,setters for the above attributes.create constructor which takes parameter in the above sequence.
create class Solution  with main method.Implement two static methods-findAgencyWithHighesstPackagePrice and
agencyDetailsforGivenIdAndType in Solution class.

findAgencyWithHighesstPackagePrice method:
  This  method will take array of TravelAgencies objects as an input parameter and return the highest package price from the given array of objects.

agencyDetailsforGivenIdAndType method:
    This method will take the input parameters-array of TravelAgencies objects,int parameter regNo and String parameter packageType.
This method will return the TravelAgencies object based on below conditions.

  1.FlightFacility should be available.
  2. The input parameters(regNo and packageType) shoould matched with the regNo and packageType of TravelAgencies object.
    if any of the above conditions are not met,then the method should return null.

NOTE: Same travel agency can have more thwn one package type.
Travel agency and package type combination is unique.All the searches should be case insensitive.

 The above  mentioned static methds should be calld from the main method.for findAgencyWithHighesstPackagePrice metthod-
  the main method should print the highestPackagePrice as it is.

  For agencyDetailsForGivenIdAndType method-The main method should print the AgencyName and pric of the returned object.
The AgencyName and price should be concatinated with:while printing.

INPUT:
123            987
a2z agency     cox and kings
platinum       diamond
50000          40000
true           true
345            888
sss agency     global tours
gold           silver
30000          20000
false          false
               987
               diamond


*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        int regNo;
   String agencyName;
   String packageType;
   int price;
   boolean flightFacility;
   
   TravelAgencies[] travelAgencies = new TravelAgencies[4];
   Scanner sc=new Scanner(System.in);
   for(int i=0;i<travelAgencies.length;i++){
       regNo=sc.nextInt();
       sc.nextLine();
       agencyName=sc.nextLine();
       packageType=sc.nextLine();
       price=sc.nextInt();
       flightFacility=sc.nextBoolean();
       
       travelAgencies[i]=new TravelAgencies(regNo,agencyName,packageType,price,flightFacility);
   }
   int regNo1=sc.nextInt();
   sc.nextLine();
   String packageType1=sc.nextLine();
   
   int highestPackagePrice=findAgencyWithHighesstPackagePrice(travelAgencies);
   System.out.println(highestPackagePrice);
   
   TravelAgencies travelAgencies1=agencyDetailsforGivenIdAndType(travelAgencies,regNo1,packageType1);
   System.out.println(travelAgencies1.agencyName+":"+TravelAgencies1.price);
   
  }
  public static int findAgencyWithHighesstPackagePrice(TravelAgencies[i] travelAgencies){
      int highestPackagePrice1=0;
      for(int i=0;i<travelAgencies.length;i++){
          if(travelAgencies[i].price>highestPackagePrice1){
              highestPackagePrice1=travelAgencies.price;
          }
      }
      return highestPackagePrice1;
      //System.out.println(highestPackagePrice1);
  }
  public static travelAgencies agencyDetailsforGivenIdAndType(TravelAgencies[i] travelAgencies,int regNo,String packageType){
      for(int i=0;i<travelAgencies.length;i++){
          if(travelAgencies[i].flightFacility){
               if(travelAgencies[i].regNo==regNo && travelAgencies[i].packageType.equalsIgnoreCase(packageType))
                     return travelAgencies[i];
          }}
  }
  return null;
}
class TravelAgencies {
   int regNo;
   String agencyName;
   String packageType;
   int price;
   boolean flightFacility;

  TravelAgencies(int regNo,String agencyName,String packageType,int price,boolean flightFacility){
      this.regNo=regNo;
      this.agencyName=agencyName;
      this.packageType=packageType;
      this.price=price;
      this.flightFacility=flightFacility;
  }
