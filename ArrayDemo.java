package core.java;

import java.util.Scanner;

public class ArrayDemo {
public static void main(String[] args) {
	int a[]=new int[5];
	int i,j,temp,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array Elements");
	for(i=0;i<a.length;i++)
	{
		System.out.print("Enter "+i+" Element : ");
		a[i]=sc.nextInt();
		sum=sum+a[i];
		
	}
	System.out.println("Sum of Array Elements : "+sum);
	System.out.println("Array Elements Are");
	for(i=0;i<a.length;i++) {
		System.out.println("A["+i+"] = "+a[i]);
	}
	for (i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("Array elemets are in ascending oredr");
	for(i=0;i<a.length;i++)
	{
		System.out.println("A["+i+"] = "+a[i]);
		
	}
	for (i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
	if(a[i]<a[j])
	{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
		}
	}
	System.out.println("Array elements are in descending order");
	for(i=0;i<a.length;i++)
	{
		System.out.println("A["+i+"] = "+a[i]);
	}
	
}
}

























