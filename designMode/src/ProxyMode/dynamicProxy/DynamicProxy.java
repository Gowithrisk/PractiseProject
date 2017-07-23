package ProxyMode.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler
{

	private Object object;

	// 这个方法可以拆成两个， Proxy.newProxyInstance()方法可以在客户端调用的时候再创建
	public Object getHandler(Object obj)
	{
		object = obj;
		// 必须使用Proxy.newProxyInstance 方法返回实例
		// 被代理的类必须是有接口类的
		// this啥意思？
		return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		// SimpleDateFormat sdf = new SimpleDateFormat("YY-MM-DD HH:MM:SS");
		// sdf.parse(String.valueOf(System.currentTimeMillis()));
		// System.out.println();
		method.invoke(object, args);
		return null;
	}

}
