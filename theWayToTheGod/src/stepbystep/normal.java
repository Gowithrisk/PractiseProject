package stepbystep;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import stepbystep.TO.Hero;

public class normal
{

	// test
	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		// test
		int ticket = 1;
		Hero ss = new Hero("ss");

		ExecutorService es = Executors.newFixedThreadPool(5);
		FutureTask<String> task = new FutureTask<>(new bussiness(ss, "task1"));
		es.submit(task);

		while (task.isDone())
		{
			System.out.println(task.get());
		}

		es.shutdown();
	}

}

class bussiness implements Callable<String>
{
	public bussiness(Hero hero, String var)
	{
		this.var1 = var;
		this.hero = hero;
	}

	private String var1;
	private Hero hero;

	@Override
	public String call() throws Exception
	{
		Thread.sleep(3000);
		System.out.println(Thread.currentThread().getName() + ":" + hero.getName() + " says: " + var1);

		return this.var1;
	}

}