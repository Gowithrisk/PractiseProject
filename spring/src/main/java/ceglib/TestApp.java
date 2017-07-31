package ceglib;

import org.springframework.cglib.proxy.Enhancer;

import bean.Zus;

public class TestApp
{

	public static void main(String[] args)
	{
		CegProxy cp = new CegProxy();
		cp.setTargetObject(new Zus());

		Enhancer enhancer = new Enhancer();
		enhancer.setCallback(cp);
		enhancer.setSuperclass(Zus.class);

		Zus zus = (Zus) enhancer.create();
		zus.killingSpring();
	}

}
