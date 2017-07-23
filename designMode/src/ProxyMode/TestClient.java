package ProxyMode;

import ProxyMode.bussiness.IBusiness;
import ProxyMode.bussiness.MyBusiness;
import ProxyMode.dynamicProxy.DynamicProxy;
import ProxyMode.staticProxy.StaticProxy;

public class TestClient
{
	private static void staticProxy()
	{
		System.out.println("[test] start Static Proxy Mode");
		StaticProxy sProxy = new StaticProxy();
		sProxy.justDoIt();
	}

	private static void DynamicProxy()
	{
		System.out.println("[test] start Dynamic Proxy Mode");
		DynamicProxy dp = new DynamicProxy();
		IBusiness iBusiness = (IBusiness) dp.getHandler(new MyBusiness());
		iBusiness.justDoIt();
	}

	public static void main(String[] args)
	{
		staticProxy();
		DynamicProxy();
	}

}
