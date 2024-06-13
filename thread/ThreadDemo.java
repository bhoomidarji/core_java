package core.thread;

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread t=Thread.currentThread(); 
		System.out.println(t);
		t.setName("My Thread");
		System.out.println(t);
		t.setPriority(3);
		System.out.println(t);
		for (int i=0;i<5;i++)
		{
			System.out.println(t+" : "+i);
			Thread.sleep(3000);
		}
		System.out.println("main Thread Exiting");
		
	}
		


}
