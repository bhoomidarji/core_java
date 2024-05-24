package core.java;

import java.util.Scanner;

public class Staticvariable {
static int a;
void setA()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A :");
	a=sc.nextInt();
}
void putA() {
	System.out.println("A : "+a);
}
public static void main(String[] args) {
	Staticvariable s1=new Staticvariable();
	Staticvariable s2=new Staticvariable();
	Staticvariable s3=new Staticvariable();
	Staticvariable s4=new Staticvariable();
	
	s1.setA();
	s2.setA();
	s3.setA();
	
	s1.putA();
	s2.putA();
	s3.putA();
	s4.putA();
}
}
