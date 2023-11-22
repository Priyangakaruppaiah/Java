/*
create a class Antenna with below attributes.
antennaid=int
antennaName=String
projectLead=String
antennaVSWR=double

the above attribute should be private ,write getter and setter and parametrized constructor as well.

create class MyClass with main method.
implement two static methods searchAntennaByName and sortAntennaByVSWR in MyClass class.


searchAntennaByName :
---------------------------------------
This method will take an array of Antenna objects and the string value as input parameter.The method will find out Antenna name(String parameterpassed).
It will return Antennaid if found.if there is no Antenna that matches then the method will return zero.
The main method should print the antennaid,if the returned value is not 0.if the returned value is 0 then print,"There is no antenna with the given parameter".


sortAntennaByVSWR:
--------------------------------------
This method will take an array of Antenna Objects and a double value as input.
This method will return an array of Antenna objects sorted in ascending orderof their antennaVSWR, which is less than VSWR(double value passed).       

The main method should print name of the project leads from the returned array if the returned value is not null.if the returned value is null then main method 
should print "No Antenna found";


input1:

111
Reconfigurable
Hema
0.4
222
Wearable
Kavya
0.9
333
Microstrip
Teju
0.3
444
Dielectric
Sai
0.65
Microstrip
0.5

output:
333
Teju
Hema


input 2:
111
Reconfigurable
Hema
0.3
222
Wearable
Kavya
0.9
333
Microstrip
Teju
0.4
444
Dielectric
Sai
0.65
Resonator
0.25

output:
There is no antenna with given parameter
No Antenna found
*/
import java.util.*;
public class IPA18
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Antenna[] an = new Antenna[4];
		for(int i=0; i<4; i++)
		{
			int a = sc.nextInt();sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			double d = sc.nextDouble();sc.nextLine();
			
			an[i]=new Antenna(a,b,c,d);
		}	
		String str = sc.nextLine();
		double num = sc.nextDouble();
		int res1 = search(an,str);
		if(res1==0)
		{
			System.out.println("There is no antenna with the given parameter");
		}
		else
		{
			System.out.println(res1);
		}
		Antenna[] res2 = sortAntenna(an, num);
		if(res2 == null)
		{
			System.out.println("No Antenna found");
		}
		else
		{
			for(int i=0; i<res2.length; i++)
			{
				System.out.println(res2[i].getLead());
			}
		}
	}
	public static int search(Antenna[]an,String s)
	{
		for(int i=0; i<an.length; i++)
		{
			if(an[i].getName().equalsIgnoreCase(s))
			{
				return an[i].getId();
			}
		}
		return 0;
	}
	public static Antenna[] sortAntenna(Antenna[]an, double num)
	{
		Antenna[] a = new Antenna[0];
		for(int i=0; i<an.length; i++)
		{
			if(an[i].getVSWR()<num)
			{
				a = Arrays.copyOf(a, a.length+1);
				a[a.length-1]=an[i];
			}
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length-i-1; j++)
			{
				if(a[i].getVSWR()>a[i+1].getVSWR())
				{
					Antenna temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}		
			}
		}
		if(a.length>0)
		{
			return a;
		}	
		else
		{
			return null;
		}
	}
}

class Antenna
{
	private int id;
	private String name,lead;
	private double VSWR;
	public Antenna(int id, String name, String lead, double VSWR)
	{
		this.id = id;
		this.name = name;
		this.lead = lead;
		this.VSWR = VSWR;
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
	public String getLead()
	{
		return lead;
	}
	public void setLead(String lead)
	{
		this.lead = lead;
	}
	public double getVSWR()
	{
		return VSWR;
	}
	public void setVSWR()
	{
		this.VSWR=VSWR;
	}
}
