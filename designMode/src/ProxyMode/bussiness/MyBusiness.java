package ProxyMode.bussiness;

public class MyBusiness implements IBusiness
{

	@Override
	public void justDoIt()
	{
		System.out.println(this.getClass() + ": justDoIt");
	}

}
