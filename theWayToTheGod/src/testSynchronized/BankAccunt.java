package testSynchronized;

public class BankAccunt
{

	public BankAccunt()
	{

	}

	// 饿汉模式 就是直接 new 出来;
	private static volatile BankAccunt userCount;

	public static BankAccunt getInstance()
	{
		if (null == userCount)
		{
			synchronized (BankAccunt.class)
			{
				System.out.println("singleton new.");
				userCount = new BankAccunt();
			}
		}
		System.out.println("singleton old.");
		return userCount;
	}

	private long money = 1000;

	public long getMoney()
	{
		return money;
	}

	public void setMoney(long money)
	{
		this.money = money;
	}

	public void saveMoney(long money)
	{
		System.out.println("save" + money);
		this.money += money;
	}

	public void takeMoney(long money)
	{
		System.out.println("取了" + money);
		this.money -= money;
	}

}
