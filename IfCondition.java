package core.java;

import java.util.Scanner;

public class IfCondition {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A :");
		a=sc.nextInt();
		System.out.print("Enter B :");
             b=sc.nextInt();
             if (a>b)
		{
			System.out.println("A is max number.");
			
		}
             else
             {
            	 System.out.println("B is max number.");
             }
		
		

	}

}
