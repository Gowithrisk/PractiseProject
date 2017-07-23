package sellTickets;

import java.util.concurrent.FutureTask;

public class app
{
	public static void main(String[] args)
	{
		MaiPiao maiPiao = new MaiPiao();
		FutureTask<Integer> iFutureTask = new FutureTask<>(maiPiao);
		Thread my1 = new Thread(iFutureTask);
		Thread my2 = new Thread(new FutureTask<>(maiPiao));
		Thread my3 = new Thread(new FutureTask<>(maiPiao));

		my1.start();
		my2.start();
		my3.start();

	}
}
