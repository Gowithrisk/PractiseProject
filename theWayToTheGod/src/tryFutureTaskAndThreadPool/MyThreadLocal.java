package tryFutureTaskAndThreadPool;

/**
 * 测试 ThreadLocal的独立性 shit 没跑通
 * 
 * @author Administrator
 *
 */
public class MyThreadLocal
{
	private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>() {
		public Integer initalValue()
		{
			return 1;
		}
	};

	public int getNextNum()
	{
		seqNum.set(seqNum.get() + 1);
		return seqNum.get();
	}

	private static class myThread extends Thread
	{

		private MyThreadLocal myThreadLocal;

		public myThread(MyThreadLocal myThreadLocal)
		{
			this.myThreadLocal = myThreadLocal;
		}

		@Override
		public void run()
		{
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			for (int i = 0; i < 3; i++)
			{
				System.out.println(
						"[Thread][" + Thread.currentThread().getName() + "]; sn[" + myThreadLocal.getNextNum() + "]");
			}
		}
	}

	public static void main(String[] args)
	{
		MyThreadLocal myThreadLocal = new MyThreadLocal();

		myThread t1 = new myThread(myThreadLocal);
		myThread t2 = new myThread(myThreadLocal);
		myThread t3 = new myThread(myThreadLocal);
		myThread t4 = new myThread(myThreadLocal);

		t1.run();
		System.out.println("mark1");
		t2.run();
		System.out.println("mark1");
		t3.run();
		System.out.println("mark1");
		t4.run();
	}
}
