package sellTickets;

import java.util.concurrent.Callable;

public class MaiPiao implements Callable<Integer>
{
	private int tickets = 10;

	@Override
	public synchronized Integer call() throws Exception
	{
		System.out.println(Thread.currentThread().getName() + ":" + tickets);
		for (int i = 0; i <= 20; i++)
		{
			// synchronized (this)
			// {
			if (this.tickets > 0)
			{
				tickets--;
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + "卖了一张票，还剩:" + tickets);
			}
			// }
		}
		return null;
	}

}
