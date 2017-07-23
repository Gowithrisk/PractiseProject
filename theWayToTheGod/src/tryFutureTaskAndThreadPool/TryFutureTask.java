package tryFutureTaskAndThreadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TryFutureTask
{

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{

		FutureTask<String> iFutureTask;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++)
		{
			iFutureTask = new FutureTask<>(new WorkingThread());
			iFutureTask.run();

			// sb.append(iFutureTask.get() + "\r\n");
			System.out.println("iFutureTask.run() result :" + iFutureTask.get());
		}

		FutureTask<String> iFutureTask2 = new FutureTask<String>(new Callable<String>() {
			@Override
			public String call()
			{

				return "ddddd";
			}
		});
		iFutureTask2.run();
		System.out.println("iFutureTask.run() result :" + iFutureTask2.get());
	}

}
