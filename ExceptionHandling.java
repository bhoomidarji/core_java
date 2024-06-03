package Com.exception;

import java.util.Scanner;

public class ExceptionHandling {
public static void main(String[] args) {
	System.out.println("Start code");
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter A : ");
    a=sc.nextInt()	;
    System.out.print("Enter B : ");
    b=sc.nextInt();
    c=a/b;
    System.out.println("Division : "+c);
    System.out.println("End Code");

    
}
}
