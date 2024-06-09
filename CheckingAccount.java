package Com.exception;



public class CheckingAccount {
	int acno;
	String cname;
	double balance;
	public CheckingAccount(int acno, String cname, double balance) {
		this.acno = acno;
		this.cname = cname;
		this.balance = balance;
		System.out.println("Hello "+cname+",your Account Number "+acno+" Is Opened With "+balance+"Rs.");
	}
	public void deposit(double amount)
	{
		this.balance=this.balance+amount;
	}
public void withdraw(double amount) throws InsufficientFund
{
	if(amount<=this.balance)
	{
		this.balance=this.balance-amount;
	}
	else
	{
		throw new InsufficientFund(amount-this.balance);
	}
}
public void checkBalance()
{
	System.out.println("Current Balance : "+this.balance);
}
}
