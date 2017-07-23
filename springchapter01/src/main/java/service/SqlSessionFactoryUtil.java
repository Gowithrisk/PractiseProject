package service;

import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtil
{
	// 单例
	private static SqlSessionFactory sqlSessionFactory;

	// 工厂类，返回工厂对象
	public static SqlSessionFactory getSqlSessionFactory()
	{
		if (sqlSessionFactory == null)
		{
			InputStream inputStream = null;
			try
			{
				String surce = "mybatis-config.xml";
				inputStream = Resources.getResourceAsStream(surce);
				Reader reader = Resources.getResourceAsReader(surce);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		return sqlSessionFactory;
	}

	// Session是啥？ 会话吧，当前的一次连接
	public static SqlSession openSession()
	{
		return getSqlSessionFactory().openSession();
	}
}
