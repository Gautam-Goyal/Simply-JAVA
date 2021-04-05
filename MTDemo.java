class First extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			if(i==3)
			{
				System.out.println("Giving my control");
				Thread.yield();
			}
			System.out.println("i ="+i);
		}
	}
}

class Second extends Thread
{
	public void run()
	{
		for(int j=1;j<5;j++)
		{
			if(j==3)
			{
				System.out.println("Going to sleep");
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			System.out.println("j ="+j);
		}
	}
}

class Third extends Thread
{
	public void run()
	{
		for(int k=1;k<5;k++)
		{
			if(k==4)
			{
				stop();
			}
			System.out.println("k ="+k);
		}
	}
}

class MTDemo
{
	public static void main(String args[])
	{
		System.out.println("Main thread");
		First t1=new First();
		Second t2=new Second();
		Third t3=new Third();
		t1.start();
		t2.start();
		t3.start();
		System.out.println("End of main");
	}
}