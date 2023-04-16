package java_programs;

public class ByRunnableThread implements Runnable {
	
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("This is child thread");
		}
	}

}
class Runnable1 {
	
	public static void main(String args[])
	{
		ByRunnableThread r=new ByRunnableThread();
		
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0; i<4; i++)
		{
			System.out.println("This is main thread");
		}
	}
}