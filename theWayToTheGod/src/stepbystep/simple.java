package stepbystep;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 最简单的多线程，没有线程变量，没有线程池，没有任务调度
 * 
 * @author Administrator
 *
 */

public class simple
{

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{

		FutureTask<String> iFutureTask = new FutureTask<String>(new Callable<String>() {
			@Override
			public String call() throws Exception
			{
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
				return "123";
			}

		});
		double time1 = System.currentTimeMillis();
		Thread t2 = new Thread(iFutureTask, "t2");
		Thread t1 = new Thread(iFutureTask, "t1");
		Thread t3 = new Thread(iFutureTask, "t3");

		t1.start();
		t2.start();
		t3.start();

		System.out.println("current thread name:" + t2.getName() + ";" + iFutureTask.get());
		System.out.println("current thread name:" + t3.getName() + ";" + iFutureTask.get());
		System.out.println("current thread name:" + t1.getName() + ";" + iFutureTask.get());
		double time2 = System.currentTimeMillis();
		System.out.println("time:" + (time2 - time1));
	}

}
