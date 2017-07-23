package tryFutureTaskAndThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import util.DateTimeUtil;

public class FutureWithThreadPool
{

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		// ExecutorService eService = Executors.newCachedThreadPool();
		ExecutorService eService = Executors.newFixedThreadPool(5);

		Future<String> result;
		for (int i = 0; i < 10; i++)
		{
			result = eService.submit(new WorkingThread());
			System.out.println(
					"[debug][:" + DateTimeUtil.getCurrentDateTime() + "] result:" + result + "; " + result.get());
		}
		eService.shutdown();

	}

}
