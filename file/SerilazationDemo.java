package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable
{
	int eid;
	String ename;
	double salary;
	public Emp(int eid, String ename, double salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
}

public class SerilazationDemo {
	public static void main(String[] args) throws IOException {
		Emp e1=new Emp(1,"Bhoomi",50000);
		FileOutputStream fos=new FileOutputStream("ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.flush();
		oos.close();
		System.out.println("object written successfully");
		
		FileInputStream fis=new FileInputStream("ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ois.close();
		
		
		
		
	}
	

}
