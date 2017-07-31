package ceglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CegProxy implements MethodInterceptor
{

	private Object targetObject;

	public void setTargetObject(Object targetObject)
	{
		this.targetObject = targetObject;
	}

	@Override
	public Object intercept(Object object, Method method, Object[] arg, MethodProxy methodProxy) throws Throwable
	{
		System.out.println("ceglib in; method:" + method);
		Object ob = methodProxy.invoke(targetObject, arg);
		System.out.println("ceglib out; method:" + method);
		return ob;
	}

}
