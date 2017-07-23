package testSynchronized;

public class mainApp
{

	public static void main(String[] args)
	{

		BankAccunt lily = new BankAccunt();
		System.out.println("1");

		BankAccunt lilyTwo = BankAccunt.getInstance();
		BankAccunt lilyThree = BankAccunt.getInstance();

		// liliTwo 和 lilyThree都在操作这个账号，这两个人都有密码

		// 这个账号是现在有多少钱呢？
		System.out.println("the account money is :" + BankAccunt.getInstance().getMoney());

		// liliTwo 存了1000块
		lilyTwo.saveMoney(100);

		// liliThree 取了2000块
		lilyThree.takeMoney(200);

		// 这个账号是现在有多少钱呢？
		System.out.println("after the account money is :" + BankAccunt.getInstance().getMoney());

	}

}
