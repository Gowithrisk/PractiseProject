package factoryMode;

interface IFruit
{
	public void eat();
}

class Apple implements IFruit
{
	@Override
	public void eat()
	{
		System.out.println("eat apple");
	}
}

class Banana implements IFruit
{
	@Override
	public void eat()
	{
		System.out.println("eat Banana");
	}
}

class SimpleFactory
{
	private SimpleFactory()
	{
	};

	public static IFruit getInstance(String className)
	{
		Class<?> cls;
		IFruit fruit = null;
		try
		{
			cls = Class.forName(className);
			fruit = (IFruit) cls.newInstance();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return fruit;
	}
}

class BetterFactory
{
	private BetterFactory()
	{
	};

	@SuppressWarnings("unchecked")
	public static <T> T getInstance(String className)
	{
		T obj = null;
		try
		{
			obj = (T) Class.forName(className).newInstance();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return obj;
	}
}

public class FactoryMode
{
	public static void main(String[] args)
	{
		IFruit fruit = null;
		fruit = SimpleFactory.getInstance("factoryMode.Apple");
		fruit.eat();
		fruit = BetterFactory.getInstance("factoryMode.Banana");
		fruit.eat();
	}
}
