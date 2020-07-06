import java.util.*;

public class Test extends Thread {
	
	public void run()
	{
		for(int i=1;i<=20;i++){
			
			if(Thread.currentThread().getName().equals("Thread-0"))
			{
				if(i%2==0)
				{
					System.out.println(i);
				}
			}
			else if(Thread.currentThread().getName().equals("Thread-1"))
			{
				if(i%2!=0)
				{
					System.out.println(i);
				}
			}
		}
	}
	public static void main(String[] args) 
	{ 	
		Test t1 = new Test();
		Test t2 = new Test();
		
		t1.start();
		try{
			t1.join();
		}
		catch(Exception e)
		{
		}
		
		t2.start();
	}
}
