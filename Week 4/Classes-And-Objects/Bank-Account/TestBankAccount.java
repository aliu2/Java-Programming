public class TestBankAccount
{
	public static void main(String[] args)
	{
		//Testing default constructor and toString method
		BankAccount defaultAccount = new BankAccount();
		System.out.println(defaultAccount);

		//Testing construcor, withdraw method and deposit method
		BankAccount currentAccount = new BankAccount(10000.00);
		currentAccount.withdraw(300);
		currentAccount.deposit(50);
		System.out.println(currentAccount);

		//Testing setter and getter
		currentAccount.setBalance(200);
		System.out.println(currentAccount.getBalance());

	}
}
