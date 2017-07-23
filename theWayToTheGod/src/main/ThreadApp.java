package main;

import java.util.Random;

public class ThreadApp
{

	public static void main(String[] args)
	{
		TryTheadFoo t1 = new TryTheadFoo("Thread1");
		TryTheadFoo t2 = new TryTheadFoo("Thread2");

		TryRunable r1 = new TryRunable("runable1");

		Thread r11 = new Thread(r1);
		Thread r21 = new Thread(r1);
		// t1.start();
		// t2.start();

		r11.start();
		r21.start();

		System.out.println("random: " + new Random().nextInt());

	}

}
