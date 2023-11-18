/*
Create the class Flowers with below attribute:

flowerId-int;
flowerName-String;
price-int;
rating-int;
type-String;

The above attributes must be private,write getters and setters and parametrized constructor as well.

Create class MyClass with main method.

Implement one static method:findMinPriceByType in MyClass class.

findMinPriceByType Method:

This method will take two input parameters:Array of Flower objects and String parameter.This method will return the minimum 
priced flower object from  array of Flower objects for the given type(String parameter),only if the rating is greater than 
3. If no Flowers with the above conditions are present in the array of the flower objects,then the method will return null.

For this method-The main method  should print the flowerId from the returned object if the returned value is not null.
else it should print "There is no flower with given type".

**********************************************************************

input1:

123
Yellow trout lilly
3000
5
ephemerals
345
snowdrop
2500
4
ephemerals
321
Yarrow
1000
4
perennials
213
red trillium
2250
4
ephemerals
ephemerals



output:

213





**********************

input2:

123

Yellow trout lilly

3000

5

ephemerals

345

snowdrop

2500

4

ephemerals

321

Yarrow

1000

4

perennials

213

red trillium

2250

4

ephemerals

Biennial


output2:

There is no flower with given type.
*/
import java.util.*;
public class IPA19
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		Flower[] fl = new Flower[4];
		for(int i=0; i<4; i++)
		{
			int a = sc.nextInt();sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();sc.nextLine();
			int d = sc.nextInt();sc.nextLine();
			String e = sc.nextLine();
			
			fl[i] = new Flower(a,b,c,d,e);
		}
		String f = sc.nextLine();
		int id = findMinPriceByType(fl,f);
		if(id!=0)
		{
			System.out.println(id);
		}
		else
		{
			System.out.println("There is no flower with given type");
		}
	}
	public static int findMinPriceByType(Flower[] fl, String s)
	{
		Flower[] arr = new Flower[0];
		for(int i =0; i<fl.length; i++)
		{
			if(fl[i].getType().equalsIgnoreCase(s) && fl[i].getRating()>3)
			{
				arr = Arrays.copyOf(arr,arr.length+1);
				arr[arr.length-1] = fl[i];
			}
		}
		if(arr.length>0)
		{
			Flower mini = arr[0];
			for (int j = 1; j < arr.length; j++) 
			{
				if(mini.getPrice()>arr[j].getPrice())
				{
					mini = arr[j];
				}
			}
			return mini.getFlowerId();
		} 
		return 0;
	}
}
class Flower
{
	private int flowerId;
	private String flowerName;
	private int price;
	private int rating;
	private String type;
	
	public Flower(int flowerId, String flowerName, int price, int rating, String type)
	{
		this.flowerId = flowerId;
		this.flowerName= flowerName;
		this.price = price;
		this.rating = rating;
		this.type = type;
	}
	
	public int getFlowerId()
	{
		return flowerId;
	}
	public void setFlowerId(int flowerId)
	{
		this.flowerId = flowerId;
	}
	public String getFlowerName()
	{
		return flowerName;
	}
	public void setFlowerName(String flowerName)
	{
		this.flowerName = flowerName;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getRating()
	{
		return rating;
	}
	public void setRating(int rating)
	{
		this.rating = rating;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
}
