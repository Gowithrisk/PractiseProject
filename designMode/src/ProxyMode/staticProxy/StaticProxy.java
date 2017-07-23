package ProxyMode.staticProxy;

import ProxyMode.bussiness.IBusiness;
import ProxyMode.bussiness.MyBusiness;

public class StaticProxy implements IBusiness
{

	private MyBusiness myBusiness;

	@Override
	public void justDoIt()
	{
		if (myBusiness == null)
		{
			myBusiness = new MyBusiness();
		}
		myBusiness.justDoIt();
	}

}
