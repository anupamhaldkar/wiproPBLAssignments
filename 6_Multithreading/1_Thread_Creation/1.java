import java.util.*;

public class Test extends Thread {
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" :"+i);
		}
	}
	public static void main(String[] args)
	{ 	
		Test t1 = new Test();
		Test t2 = new Test();
		t1.setName(“Scooby”);
		t2.setname(“Shaggy”);
		t1.start();
		t2.start();
	}
}
