import java.util.*;

public class Test implements Runnable {
	
	public void run()
	{
		String colours[]={"white","blue","black","green","red","yellow"};
		Random r = new Random();
		int i = r.nextInt(6);
		
		while(!colours[i].equals("red"))
		{
			System.out.println(colours[i]);
			i = r.nextInt(6);
		}
		
	}
	public static void main(String[] args)
	{ 	
		Test t1 = new Test();
		Thread th1 = new Thread(t1);
		th1.start();
	}
}
