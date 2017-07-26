package bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class BeanAssTest extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public BeanAssTest(String testName)
	{
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite(BeanAssTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		ClassPathXmlApplicationContext apc = new ClassPathXmlApplicationContext("spring-bean.xml");
		Zus zus = (Zus) apc.getBean("zus");
		System.out.println(zus.toString());
	}
}
