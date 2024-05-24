package core.java;

public class StaticMethod {
	static int a=10;
	static int b;
	{
		System.out.println("Block 1");
	}
	static void meth(int x)
	{
		System.out.println("X : "+x);
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		
	}
	static
	{
		System.out.println("static block initialized");
		b=a*4;
	}
	{
		System.out.println("block 2");
	}
	StaticMethod()
	{
		System.out.println("default constructor called");
	}
	public static void main(String[] args) {
		StaticMethod s=new StaticMethod();
		meth(12);
	}

}
