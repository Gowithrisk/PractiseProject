package tryFutureTaskAndThreadPool;

import java.util.Random;
import java.util.concurrent.Callable;

import util.DateTimeUtil;

public class WorkingThread implements Callable<String>
{

	@Override
	public String call() throws Exception
	{
		String number = String.valueOf(new Random().nextInt());
		Thread.sleep(500);
		System.out.println("[info][WorkingThread time]:" + DateTimeUtil.getCurrentDateTime());
		return number;
	}

}
