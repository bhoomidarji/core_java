package core.java;

import java.util.Scanner;

class A {
	int a;
	void  getA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A : ");
		a=sc.nextInt();
		
	}
	void PutA()
	{
		System.out.println("A : "+a);

	}
	
}
class B extends A
{
	int b;
	void getB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter b : ");
		b=sc.nextInt();
				
	}
	void putB()
	{
		System.out.println("B : "+b);
	}


{
	
}
}
class C extends B
{
	int c;
	void getC()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter C : ");
		c=sc.nextInt();
	}
	void putC()
	{
		System.out.println("C : "+c);
	}
}


public class Inheritance {
	public static void main(String[] args) {
		C c1=new C();
		c1.getA();
		c1.getB();
		c1.getC();
		c1.PutA();
		c1.putB();
		c1.putC();
		
	}
	
	

}
