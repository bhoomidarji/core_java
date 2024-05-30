package core.java;
class F1 
{
	final  int a;
	
	 F1()
	{
		a=10;
	}
	  void show()
	 {
		 System.out.println("show from F1");
	 }
}
class F2 extends  F1
{
	void show ()
	{
		System.out.println("show from f2");
	}
	
}
public class FinalDemo {
	public static void main(String[] args) {
		F2 f=new F2();
		f.show();
	}

}
