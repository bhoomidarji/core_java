package Com.exception;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double amount;
		CheckingAccount c=new CheckingAccount(101,"Bhoomi",1000);
		while(true)
		{
			System.out.println("*******************************************");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("*******************************************");
			System.out.println("Enter Your Choice : ");
			int choice=sc.nextInt();
			System.out.println("*******************************************");
			if (choice==1)
			{
				System.out.println("Enter Deposit Amount : ");
				amount=sc.nextDouble();
				c.deposit(amount);
				System.out.println("*******************************************");
			}
			else if (choice==2)
			{
				System.out.println("Enter Withdrawal Amouunt : ");
				amount=sc.nextDouble();
				try
				{
					c.withdraw(amount);
				}
				catch (InsufficientFund i)
				{
					System.out.println("Sorry You Need Another "+i.getamount()+"Rs.");
				}
				System.out.println("*******************************************");
			}
			else if (choice==3)
			{
				c.checkBalance();
				System.out.println("*******************************************");
			}
			else if (choice==4)
			{
				System.out.println("Thank you for using our service");
				System.out.println("*******************************************");
				break;
			}
			else
			{
				System.out.println("Invalid Choice. Please Try Agian");
				System.out.println("*******************************************");
			}
			System.out.println("*******************************************");
		}
	}

}
