public class BankAccount
{

	private double balance;

	//Default constructor
	public BankAccount()
	{
		this.balance = 100.00;
	}

	//Constructor
	public BankAccount(double balance)
	{
		this.balance = balance;
	}

	//Withdraws given amount from current balance
	public void withdraw(double amount)
	{
		balance -= amount;
	}

	//Deposits given amount to current balance
	public void deposit(double amount)
	{
		balance += amount;
	}

	//toString method
	public String toString()
	{
		return "The balance is " + balance;
	}

	//Sets balance (setter)
	public void setBalance(double amount)
	{
		balance = amount;
	}

	//Gets balance (getter)
	public double getBalance()
	{
		return balance;
	}
}
