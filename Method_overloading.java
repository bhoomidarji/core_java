package core.java;

public class Method_overloading {
	void test()
	{
		System.out.println("test with no arguements");
	}
	void test(int a)
	{
		System.out.println("test with 1 arguements");
	}
	void test(int a,int b)
	{
		System.out.println("test with 2 arguements");
	}
public static void main(String[] args) {
	Method_overloading m=new Method_overloading();
	m.test();
	m.test(10,20);
	m.test(10);
}
}
