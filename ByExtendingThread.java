// Multithreading Programs
// Type 1 - By Extending Thread class


package java_programs;
public class ByExtendingThread extends Thread 
{
        public void run()
        {
        	try {
        		for(int i=0;i<3;i++)
        	 {
        		System.out.println("Child Thread");
        		Thread.sleep(1000);
        	 }
        	}
        	catch(InterruptedException i)
        	{
        		
        	}
        }
}
class ExtendingThread
{
    public static void main(String args[]) throws InterruptedException
    {
    	ByExtendingThread t=new ByExtendingThread();
    	t.start();
    	
    	for(int i=0;i<3;i++)
    	{
    		System.out.println("Main Thread");
    		Thread.sleep(1000);
    	}
    }
}