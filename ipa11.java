/*
Create a class NavalVessel with the below attributes:

vesselld – int
vesselName – String
noOfVoyagesPlanned – int
noOfVoyagesCompleted – int
purpose – String


Write getters, setters for the above attributes. Create constructor which takes parameter in the above 
sequence except classification.

Create class Solution with main method. Implement two static methods – findAvgVoyagesByPct and findVesselByGrade 
in Solution class.

findAvgVoyagesByPct method:

This method will take two input parameters -array of NavalVessel objects and int parameter percentage. The method will 
return the average of the noOfVoyagesCompleted attribute from NavalVessel objects which meets the percentage requirement 
as mentioned below.The percentage for each navalVessel is calculated as 
percentage .(noOfVoyagesCompleted * 100)/noOfVoyagesPlanned. If the above calculated percentage is greater than or equal 
to the percentage passed as the parameter, then those objects should participate in the average calculation. If there are 
no objects with the mentioned criteria, then the method should return 0.

findVesselByGrade method:

This method will take a String parameter purpose, along with the array of NavalVessel objects. The method will return the 
NavalVessel object, if the input String parameter matches with the purpose attribute of the NavalVessel object. Before 
returning the object, the classification should be derived as mentioned below. This classification value should be assigned 
to the object before returning. If any of the above conditions are not met, then the method should return null. The 
classification attribute should be calculated based on the percentage calculation mentioned above. 
If the percentage = 100 then classification should be ‘Star’, if percentage is between 99 and 80 then classification should 
be ‘Leader, if percentage is between 79 and 55 then classification should be ‘Inspirer' otherwise the classification should 
be ‘Striver’ If the returned value is null then it should print “No Naval Vessel is available with the specified purpose”.

Before calling these static methods in main, use Scanner object to read the values of four NavalVessel objects referring 
attributes in the above mentioned attribute sequence (except the classification attribute). Next, read the value for 
percentage and purpose.

Input
-------------------
111
Rojer
100
100
Passenger
222
Kalam
200
100
Goods
333
Yashwin
400
300
Army
444
Thanishwini
500
500
Welfare
75
Army

Output
------------------
300
Yashwin%Inspirer
*/
import java.util.*;
public class IPA16
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        NavalVessel[] n = new NavalVessel[4];
        for (int i = 0; i < n.length; i++) 
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();

            n[i] = new NavalVessel(a,b,c,d,e);
        }
        int perc = sc.nextInt();sc.nextLine();
        String pur = sc.nextLine();
        int ans1 = findAvgVoyagesByPct(n,perc);
        if(ans1!=0)
        {
            System.out.println(ans1);
        }
        NavalVessel[] ans2 = findVesselByGrade(n,pur);
        if(ans2!=null)
        {
            for (int i = 0; i < ans2.length; i++) 
            {
                int per = ans2[i].getComp()*100/ans2[i].getPlan();
                if(per == 100)
                {
                    System.out.println(ans2[i].getName()+"%Star");
                }
                else if(per>=80 && per<=99)
                {
                    System.out.println(ans2[i].getName()+"%Leader");
                }
                else if(per<=79 && per>=55)
                {
                    System.out.println(ans2[i].getName()+"%Inspirer");
                }
                else
                {
                    System.out.println(ans2[i].getName()+"%Striver");
                }
            }
        }
        else
        {
            System.out.println("No Naval Vessel is available with the specified purpose");
        }
    }
    public static int findAvgVoyagesByPct(NavalVessel[]n, int p)
    {
        int count=0, sum=0;
        for (int i = 0; i < n.length; i++) {
            if(n[i].getComp()*100/n[i].getPlan()>=p)
            {
                sum+=n[i].getComp();
                count++;
            }
        }
        if(count>0)
        {
            int avg = sum/count;
            return avg;
        }
        else
        {
            return 0;
        }
    }
    public static NavalVessel[] findVesselByGrade(NavalVessel[]n, String p)
    {
        NavalVessel[] arr = new NavalVessel[0];
        for (int i = 0; i < n.length; i++) 
        {
            if(n[i].getPurpose().equalsIgnoreCase(p))
            {
                arr = Arrays.copyOf(arr, arr.length+1);
                arr[arr.length-1]=n[i];
            }
        }
        if(arr.length>0)
        {
            return arr;
        }
        else
        {
            return null;
        }
    }
}
class NavalVessel
{
    int id, plan, comp;
    String name, purpose;

    public NavalVessel(int id, String name, int plan, int comp, String purpose)
    {
      this.name=name;
        this.plan = plan;
        this.comp = comp;
        this.purpose = purpose;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlan() {
        return plan;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }

    public int getComp() {
        return comp;
    }

    public void setComp(int comp) {
        this.comp = comp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    
    }
    
}
