package core.java;

abstract class Abs1 {
	void meth1()

	{
		System.out.println("Meth1");
	}

	abstract void meth2();

	abstract void meth3();
}

class Abs2 extends Abs1 {
	void meth2() {
		System.out.println("Meth2");
	}

	void meth3() {
		System.out.println("Meth3");
	}
}

class Abs3 extends Abs1 {
	void meth2() {
		System.out.println("Meth2 Defined in Abs3");
	}

	void meth3() {
		System.out.println("Meth3  Defined in Abs3");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Abs2 a1 = new Abs2();
		a1.meth1();
		a1.meth2();
		a1.meth3();

		Abs3 a2 = new Abs3();
		a2.meth1();
		a2.meth2();
		a2.meth3();
	}
}
