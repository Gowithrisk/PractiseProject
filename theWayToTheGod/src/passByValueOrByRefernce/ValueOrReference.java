/**
 * Author: Dron.Hu  For test Pass by value or by reference
 */
package passByValueOrByRefernce;

public class ValueOrReference
{

	public ValueOrReference()
	{

	}

	public String name = "ValueName";

	public static void test(String str)
	{
		str = str + "change";
		System.out.println("String in :" + str);
	}

	public static void test(int int1)
	{
		int1 = int1 + 100;
		System.out.println("int in:" + int1);
	}

	public static void test(Integer int1)
	{
		int1 = int1 + 100;
		System.out.println("Integer in:" + int1);
	}

	public static void test(ValueOrReference re)
	{
		re.name = re.name + "rerere";
		System.out.println("ValueOrReference in:" + re.name);
	}

	public static void main(String[] args)
	{

		ValueOrReference iVOrReference = new ValueOrReference();

		String str1 = "hellow";
		test(str1);
		if ("hellow".equals(str1))
		{
			System.out.println("out- no change:  " + str1);
		}
		else
		{
			System.out.println("out- is change:  " + str1);
		}

		int int1 = 1;
		test(int1);
		if (1 == int1)
		{
			System.out.println("out- no change:  " + int1);
		}
		else
		{
			System.out.println("out- is change:  " + int1);
		}

		Integer Int1 = 10;
		test(Int1);
		if (10 == Int1)
		{
			System.out.println("out- no change:  " + Int1);
		}
		else
		{
			System.out.println("out- is change:" + Int1);
		}

		test(iVOrReference.name);
		if ("ValueName".equals(iVOrReference.name))
		{
			System.out.println("out- no change:  " + iVOrReference.name);
		}
		else
		{
			System.out.println("out- is change:  " + iVOrReference.name);
		}

		StringBuilder sb = new StringBuilder("iphone");

	}

}
