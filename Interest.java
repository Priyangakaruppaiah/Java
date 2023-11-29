/*
Find total interest of an amount.

Create a class Account with following attributes :
id - int
balance - double
interestRate - double

Take another integer as number of year. 
After that calculate total interest using formula:

Percentage = interestRate * 100 / time
Total Interest = Percentage + interestRate
*/

import java.util.*;
public class Calculate_Interest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();sc.nextLine();
		double b = sc.nextDouble();sc.nextLine();
		double c = sc.nextDouble();sc.nextLine();
		Account ac = new Account(a,b,c);

		int n = sc.nextInt();

		double interest = calculateInterest(ac, n);

		System.out.format("%.3f",interest);
				
	}
	public static double calculateInterest(Account ac, int n)
	{
		double per = (ac.getInterestRate()/100)*n;
		per = ac.getInterestRate()+per;
		return per;
	}
}
class Account
{
	int id;
	double balance;
	double interestRate;
	
	public Account(int id, double balance, double interestRate)
	{
		this.id = id;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getInterestRate()
	{
		return interestRate;
	}
	public void setInterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}
}
