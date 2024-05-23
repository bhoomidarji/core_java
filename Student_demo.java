
package core.java;

import java.util.Scanner;

class StudentDemo{
	int rollno;
	String sname;
	double per;
	Scanner sc=new Scanner(System.in);
	void getdata()
	{
	

	{
		System.out.print("enter roll no. of student : ");
		rollno=sc.nextInt();
		System.out.print("enter student name : ");
		sname=sc.next();
		System.out.print("enter percentage of the student : ");
		per=sc.nextDouble();
	}
	}
	void putdata()
	{
		System.out.println("rollno : "+rollno);
		System.out.println("student name : "+sname);
		System.out.println("Precentage of student : "+per);
	}
}
	


public class Student_demo {
public static void main(String[] args) {
	StudentDemo s1=new StudentDemo();
			s1.getdata();
			
			s1.putdata();
			
}
}
