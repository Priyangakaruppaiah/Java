/*
Create class Movie with below attributes: 

movieName - String 
company - String 
genre - String 
budget - int

Create class Solution and implement static method "getMovieByGenre" in the Solution class. This method will 
take array of Movie objects and a searchGenre String as parameters. And will return another array of Movie 
objects where the searchGenre String matches with the original array of Movie object's genre attribute 
(case insensitive search).

Write necessary getters and setters.

Before calling "getMovieByGenre" method in the main method, read values for four Movie objects referring the 
attributes in above sequence along with a String searchGenre. Then call the "getMovieByGenre" method and write
logic in main method to print "High Budget Movie",if the movie budget attribute is greater than 80000000 else 
print "Low Budget Movie".

Input
---------
aaa
Marvel
Action
250000000
bbb
Marvel
Comedy
25000000
ccc
Marvel
Comedy
2000000
ddd
Marvel
Action
300000000
Action

Output
-------------------
High Budget Movie
High Budget Movie
*/
import java.util.*;
public class IPA14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] m = new Movie[4];
        for (int i = 0; i < m.length; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();

            m[i] = new Movie(a,b,c,d);
        }
        String Search = sc.nextLine();
        String[] ans1 = getMovieByGenre(m, Search);
        for (int i = 0; i < ans1.length; i++) {
            System.out.println(ans1[i]);
        }
    }
    public static String[] getMovieByGenre(Movie[] m, String s)
    {
        String[] arr = new String[0];
        for (int i = 0; i < m.length; i++) {
            if(m[i].getGenre().equalsIgnoreCase(s))
            {
                if(m[i].getBudget()>80000000)
                {
                    arr = Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1]="High Budget Movie";
                }
                else
                {
                    arr = Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1]="Low Budget Movie";
                }
            }
        }
        return arr;
    }
}

class Movie
{
    String mname, company, genre;
    int budget;

    public Movie(String mname, String company, String genre, int budget)
    {
        this.mname = mname;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    
}
