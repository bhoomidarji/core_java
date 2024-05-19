package core.java;

public class JumpingStatement2 {

	public static void main(String[] args) {
		int i;
		for(i=0;i<10;i++) {
			if(i==5 || i==3 )
			{
				continue;
			}
			else
			{
				System.out.println("I : "+i);
			}
		}
	}



}
