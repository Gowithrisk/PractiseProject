package lanuch;

import org.apache.ibatis.session.SqlSession;

import Entity.UserInfo;
import dao.impl.IUserDao;
import service.SqlSessionFactoryUtil;

public class lanunch
{

	public static void main(String[] args)
	{
		SqlSession sqlSession = SqlSessionFactoryUtil.openSession();

		IUserDao userDao = sqlSession.getMapper(IUserDao.class);

		String id = "admin";

		UserInfo curUser = userDao.findUserById(id);

		if (curUser != null)
		{
			System.out.println("HelloWorld:" + curUser.getUserID());
		}

	}

}
