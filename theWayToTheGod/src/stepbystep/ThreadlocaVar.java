package stepbystep;

import stepbystep.TO.Boss;

public class ThreadlocaVar
{
	private static ThreadLocal<Boss> myThreadLocal = new ThreadLocal<Boss>();

	public static ThreadLocal<Boss> getThreadLocal()
	{
		return myThreadLocal;
	}

	public void init(Boss boss)
	{
		myThreadLocal.set(boss);
	}

}
