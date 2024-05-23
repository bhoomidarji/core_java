package core.java;

class Box
{
	double width,height,depth;
	void volume() {
		System.out.println("volume : "+(width*height*depth));
	}
	Box()
	{
		System.out.println("default constructor called");
		width=3;
		height=4;
		depth=5;
				
	}
	Box(double w,double h,double d)
	{
		System.out.println("parameterized constructor called");
	}
}

public class Constructor_Demo {
public static void main(String[] args) {
	Box b1=new Box();
	b1.volume();
	
	Box b2=new Box(4,5,6);
	b2.volume();
}

}
