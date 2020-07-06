import java.util.*;

public class Test extends Thread {
	
	public void run()
	{
		for(int i=1;i<=10;i++){
			try
			{
				if(i==6)
				{
					Thread.sleep(5000);
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{ 	
		Test t1 = new Test();
		Test t2 = new Test();
		
		t1.start();
	}
}
