package Niti;

public class Nit extends Thread
{
	int x, y;
	
	public void run()
	{
		int i = x;
		while (true)
		{
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{	
				e.printStackTrace();
			}
			System.out.println(i);
			i++;
		}
	}
	
	public Nit(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int saberi()
	{
		return x+y;
	}
}
