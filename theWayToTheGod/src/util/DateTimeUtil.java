package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil
{
	public DateTimeUtil()
	{

	}

	public static String getCurrentDateTime()
	{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aa");
		return sdf.format(date);
	}
}
