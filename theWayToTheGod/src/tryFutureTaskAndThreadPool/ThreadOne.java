package tryFutureTaskAndThreadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadOne
{

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		FutureTask<String> iFutureTask = new FutureTask<String>(new Callable<String>() {

			@Override
			public String call() throws Exception
			{
				return "1234";
			}
		});

		Thread myThread = new Thread(iFutureTask);
		Thread myThread1 = new Thread(iFutureTask, "线程1");
		Thread myThread2 = new Thread(iFutureTask);
		Thread myThread3 = new Thread(iFutureTask);
		myThread.start();
		myThread1.start();
		myThread2.start();
		myThread3.start();
		System.out.println(myThread.getName() + ":" + iFutureTask.get());
		System.out.println(myThread1.getName() + ":" + iFutureTask.get());
		System.out.println(myThread2.getName() + ":" + iFutureTask.get());
		System.out.println(myThread3.getName() + ":" + iFutureTask.get());
	}

}
