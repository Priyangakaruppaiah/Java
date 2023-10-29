/*
Create a class called Employee with the below attributes:

employeeld - int
name - String
branch - String
rating - double
company Transport - boolean
The above attributes should be private. write getters, setters and parameterized constructor as required.

Create class MyClass with main method.
Implement two static methods findCountOfEmployeesUsingCompTransport and findEmployeeWithSecondHighestRating
in MyClass class.

findCountOfEmployeesUsingCompTransport method: 
----------------------------------------------
This method will take an array of Employee object and a String parameter as input parameters. 
This method will calculate and return the count of Employees who are all using company transport 
in the given branch (String parameter passed).
If no Employee in the given branch using company transport in the array of Employee objects, then 
the method should return 0.

findEmployeeWithSecondHighestRating method: 
--------------------------------------------
This method will take an array of Employee objects as an input parameter. This method will return 
the object of the second highest rating employee from the array of Employee objects who are not using 
company transport.
If all Employees using company transport in the array of Employee objects, then the method should return null.

Note: All the searches should be case sensitive, companyTransport and rating combination of each Employee 
is unique.
For findCountOfEmployeesUsingCompTransport method, The main method should print the returned count as it 
is if the returned value is greater than 0, else it should print "No such Employees".
Ex: 2 , where 2 is the count
For findEmployeeWithSecondHighestRating method: The main method should print the employeeld and name from 
the returned object if the returned value is not null. If the returned value is null, then it should 
print "All Employees using company transport".
Ex: 1003
    Uma
where 1003 is the employeeld and Uma is the name.
Before calling these static methods in main, use Scanner object to read the values of four Employee 
objects referring attributes in the above mentioned attributes sequence. Next, read the value of String
parameter for capturing branch.

Input : 

1001
Ashwa
IT
5
true
1002
Preeti
IT
4
true
1003
Uma
Admin
3
false
1004
Akash
Hardware
4.5
false
IT



Output : 

2
1003
Uma
*/
import java.util.*;

public class IPA10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[4];
        for (int i = 0; i < emp.length; i++) 
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            boolean e = sc.nextBoolean();sc.nextLine();

            emp[i] = new Employee(a,b,c,d,e);
        }
        String br = sc.nextLine();
        int ans1 = CountOfEmployee(emp,br);
        if(ans1!=0)
        {
            System.out.println(ans1);
        }
        else{
            System.out.println("No such Employees");
        }
        Employee[] ans2 = EmployeeWithSecondHighestRating(emp);
        if(ans2!=null)
        {
            for (int i = 0; i < ans2.length; i++) {
                if(ans2[i].getRating()>ans2[i+1].getRating())
                {
                    System.out.println(ans2[i+1].getId());
                    System.out.println(ans2[i+1].getName());
                    break;
                }
            }
        }
        else
        {
            System.out.println("All Employees using company transport");
        }
    }
    public static int CountOfEmployee(Employee[]e, String b)
    {
        int count = 0;
        for (int i = 0; i < e.length; i++) {
            if(e[i].getBranch().equalsIgnoreCase(b) && e[i].getTransport()==true)
            {
                count++;
            }
        }
        if(count>0)
        {
            return count;
        }
        else{
            return 0;
        }
    }
    public static Employee[] EmployeeWithSecondHighestRating(Employee[] e)
    {
        Employee[] sec = new Employee[0];
        Employee del;
        for (int i = 0; i < e.length; i++) {
            if(e[i].getTransport()==false)
            {
                sec = Arrays.copyOf(sec, sec.length+1);
                sec[sec.length-1] = e[i];
            }
        }
        for (int i = 0; i < sec.length; i++) {
            for (int j = i; j < sec.length; j++) {
                if(sec[i].getRating()<sec[j].getRating())
                {
                    del = sec[i];
                    sec[i]=sec[j];
                    sec[j]=del;
                }   
            }
        }
        if(sec.length>0)
        {
            return sec;
        }
        else
        {
            return null;
        }
    }
}
class Employee
{
    private int Id;
    private String name;
    private String branch;
    private double rating;
    private boolean transport;

    public Employee(int Id, String name, String branch, double rating, boolean transport)
    {
        this.Id = Id;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.transport = transport;
    }

    public int getId()
    {
        return Id;
    }
    public void setId(int Id)
    {
        this.Id = Id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getBranch()
    {
        return branch;
    }
    public void setBranch(String branch)
    {
        this.branch = branch;
    }
    public double getRating()
    {
        return rating;
    }
    public void setRating(double rating)
    {
        this.rating = rating;
    }
    public boolean getTransport()
    {
        return transport;
    }
    public void setTransport(boolean transport)
    {
        this.transport= transport;
    }
}
