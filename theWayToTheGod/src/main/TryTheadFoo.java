package main;

public class TryTheadFoo extends Thread
{
	String iname;

	public TryTheadFoo(String iname)
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
		for (int i = 0; i < 100; i++)
		{
			System.out.println(this.getIname() + ":" + i);
		}
	}

}
