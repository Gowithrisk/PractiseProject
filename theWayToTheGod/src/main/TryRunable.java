package main;

public class TryRunable implements Runnable
{

	String iname;
	int count = 0;

	public int getCount()
	{
		return count;
	}

	public void setCount(int count)
	{
		this.count = count;
	}

	public TryRunable(String iname)
	{
		this.iname = iname;
	}

	public String getIname()
	{
		return iname;
	}

	public void setIname(String iname)
	{
		this.iname = iname;
	}

	@Override
	public void run()
	{
		System.out.println(this.getIname() + ": step 1" + this.count);
		try
		{
			for (int i = 0; i < 100; i++)
			{
				Thread.sleep(10);
				System.out.println(this.getIname() + ":" + i + "共享变量 t1:" + this.count++);
			}

		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
