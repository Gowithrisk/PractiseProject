package main;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TryCallable
{
	public TryCallable()
	{

	}

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		Callable<String> iCallable = new Callable<String>() {

			@Override
			public String call() throws Exception
			{
				System.out.println("123");
				return "hellow kitty";
			}
		};

		FutureTask<String> iFutureTask = new FutureTask<>(iCallable);

		new Thread(iFutureTask).start();

		System.out.println("get result from the thread : " + iFutureTask.get());
	}
}
