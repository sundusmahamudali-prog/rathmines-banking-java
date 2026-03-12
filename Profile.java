package SA1Sundus;

public class Profile {

	private String username;
	private String Password;
	private double balance;
	public Profile(String username,String password, double initialBalance)
	{
		this.username=username;
		this.Password=password;
		this.balance=initialBalance;
	}
public String getUsername()
{
	return username;
}
public String getPassword()
{
	return Password;
}
public double getBalance()
{
	return balance;
}
public void deposit(double amount) {
	if(amount>0) 
	{balance+=amount;
	System.out.println("Deposited" +amount);
		
	}
	else {
		System.out.println("Invalid deposit amount!");
	}
}
 public boolean withdraw(double amount)
{
	if (amount>0  && amount <= balance)
	{
		balance-=amount;
		System.out.println("Withdrawn:" + amount);
		return true;
	}
	else {
		System.out.println("Insufficient funds or invalid amount");
	}
	return false;
}
}
