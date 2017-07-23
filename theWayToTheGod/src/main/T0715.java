package main;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class T0715
{
	private static FutureTask<String> task()
	{
		FutureTask<String> fTask = new FutureTask<String>(new Callable<String>() {
			@Override
			public String call() throws InterruptedException
			{
				int tmp = new Random().nextInt();
				Thread.sleep(3000);
				System.out.println("current thread:" + Thread.currentThread().getName() + ":" + tmp);
				return String.valueOf(tmp);
			}
		});
		return fTask;
	}

	private static String theEasyEstWay() throws InterruptedException, ExecutionException
	{
		FutureTask<String> fTask = task();
		Thread thread = new Thread(fTask, "theEasyEstWay");
		thread.start();
		return fTask.get();
	}

	private static String normalWay() throws InterruptedException, ExecutionException
	{
		ExecutorService es = Executors.newCachedThreadPool();
		FutureTask<String> fTask = task();
		es.submit(fTask);
		es.shutdown();
		return fTask.get();
	}

	public static void main(String[] arg) throws InterruptedException, ExecutionException, ClassNotFoundException,
			InstantiationException, IllegalAccessException
	{
		Class<?> cls = new Date().getClass();
		System.out.println(cls.getName());

		Class<?> class1 = Date.class;
		System.out.println(class1.getName());

		Class<?> class2 = Class.forName("java.util.Date");
		System.out.println(class2.getName());

		Object obj = class2.newInstance();

		String easyWay = theEasyEstWay();
		String normal = normalWay();
		System.out.println("theEasyEstWay:" + easyWay);
		System.out.println("normalWay:" + normal);
	}
}
