package Com.exception;

import java.util.Scanner;

public class ThrowDemo {
	public static void demo() throws Exception
	{
		int x;
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter X : ");
			x=sc.nextInt();
			if(x>0)
			{
				System.out.println("square of "+x+" is "+(x*x));
			}
			else 
			{
				throw new ArithmeticException();
			}}
		
	public static void main(String[] args) {
		try {
	    demo();
	}
		catch (Exception e)
		{
			System.out.println("please enter positive number");
		}
		finally
		{
			System.out.println("finally called");
		}

}
}