/*
create a class Beach with below attributes:

beachId-int
beachName-String
location-String
beachType-String
rating-int
avgVisitorsPerDay-int

The above attributes should be private,write getters,settes and parameterized constructor as returned..

Create class MyClass with the main method:
Implement a static methods-findBeachWithLowestRating in MyClass.

findBeachWithLowestRating method:
      This method will take array of beach objects,a string value and an int value as a parameters,.
      This method should return the least rating from the array of beach objects in the given location(String parparameters 
      passed),which has average visitorsper day higher than the visitors (int patameter passed)
      
      if no beach with the above condition is present in array Beach objects,then the method should return 0.
Note:
  no two beaches willhave the same  rating and loction.
  
  All the serches should  be case sensitive.
   The above mentioned static method  should be called from the main method.
   
   For findBeachWithLowestRating method-   The main method should print the returned rating as it,if the returned value
  is greater than  0.it should print "No such beach" otherwise. 
  
  
  INPUT:                  
  123                          321
  calangute                 paloleum
  north goa                 south goa
  nightlife                 calanandrelax
  4                         4
  2000                      1500
  
  345                         213
  baga                        anjuan
  north goa                   north goa
  nightlife                   calamandrelax                   
  5                           3
  3000                        1000
  
  OUTPUT:                     north goa
    3                         900


*/
import java.util.*;

public class MyClass{
    public static void main(String[] args){
         int beachId;
         String beachName;
         String location;
         String beachType; 
         int rating;
         int avgVisitorsPerDay;
         
         Beach[] beach = new Beach[4];
         Scanner sc=new Scanner(System.in);
         for(int i=0;i<beach.length;i++){
             beachId=sc.nextInt();
             beachName=sc.nextLine();
             location=sc.nextLine();
             beachType=sc.nextLine();
             rating=sc.nextInt;
             avgVisitorsPerDay=sc.nextInt();
             
             beach[i]=new Beach(beachId,beachName,location,beachType,rating,avgVisitorsPerDay);
             
             
         }
         sc.nextLine();
         String queryLocation=sc.nextLine();
         int avgVisitors=sc.nextInt();
         public static void findBeachWithLowestRating(Beach[i] b,String location,int avgVisitors)
         {
             int leastRating=0;
             ArrayList<Beach> beach=new ArrayList<Beach>();
             for(int i=0;i<b.length;i++){
                 if(b[i].getLocation().equals(location) && b[i].getAvgVisitorsPerDay()>avgVisitors ){
                     beach.add(b[i]);
                 }
             }
             if(beach.size()>0){
                 Comparator<Beach> mySort = Comparator.comparing(Beach :: getRating);
                 Collectionn.sort(beach,mySort);
             }
             
         }
    
        
    }
    
}


class Beach{
    private int beachId;
    private String beachName;
    private String location;
    private String beachType; 
    private int rating;
    private int avgVisitorsPerDay;
    
    Beach(int beachId,String beachName,String location,int rating,int avgVisitorsPerDay){
        this.beachId=beachId;
        this.beachName=beachName;
        this.location=location;
        this.rating=rating;
        this.avgVisitorsPerDay=avgVisitorsPerDay;
        
    }
    
    public  int getbeachId(){
        return  this.beachId;
    }
    public String getbeachName(){
        return  this.beachName;
    }
    public String locationn(){
        return  this.location;
    }
    public  int getrating(){
        return  this.rating;
    }
    public  int getavgVisitorsPerDay(){
        return  this.avgVisitorsPerDay;
    }
    public  int setbeachId(int beachId){
         this.beachId=beachId;
    }
    public String setbeachName(String beachName){
        this.beachName=beachName;
    }
    public String locationn(String location){
        this.location=location;
    }
    public  int getrating(int rating){
        this.rating=rating;
    }
    public  int getavgVisitorsPerDay(int avgVisitorsPerDay){
         this.avgVisitorsPerDay=avgVisitorsPerDay;;
    }
    
    
    
}

