package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("tops.txt");
		String s="This is file input/output stream demo using java.";
				byte b[]=s.getBytes();
				fos.write(b);
				fos.flush();
				fos.close();
				System.out.println("file written successfully");

				 FileInputStream fis=new FileInputStream("tops.txt");
				 int i;
				 while((i=fis.read())!=-1)
				 {
					 System.out.print((char)i);
				 }
				 fis.close();			
				
}}