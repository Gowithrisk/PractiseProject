package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import Entity.UserBean;
import mapper.IUserDaoMapper;
import util.DBTools;

public class UserService implements IUserSerivce
{
	private static Logger logger = Logger.getLogger(UserService.class);

	/**
	 * 新增用户
	 */
	public static boolean insertUser(UserBean user)
	{
		SqlSession session = DBTools.getSession();
		IUserDaoMapper mapper = session.getMapper(IUserDaoMapper.class);
		try
		{
			int index = mapper.insertUser(user);
			boolean bool = index > 0 ? true : false;
			logger.info("新增用户user对象:{},操作状态:{}" + new Object[] { user, bool });
			session.commit();
			return bool;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			session.rollback();
			return false;
		}
		finally
		{
			session.close();
		}
	}

	/**
	 * 删除用户
	 * 
	 * @param id
	 *            用户ID
	 */
	public boolean deleteUser(int id)
	{
		SqlSession session = DBTools.getSession();
		IUserDaoMapper mapper = session.getMapper(IUserDaoMapper.class);
		try
		{
			int index = mapper.deleteUser(id);
			boolean bool = index > 0 ? true : false;
			logger.debug("根据用户id:{},操作状态{}" + new Object[] { id, bool });
			session.commit();
			return bool;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			session.rollback();
			return false;
		}
		finally
		{
			session.close();
		}
	}

	/**
	 * 根据id查询用户
	 * 
	 * @param id
	 */
	public void selectUserById(int id)
	{
		SqlSession session = DBTools.getSession();
		IUserDaoMapper mapper = session.getMapper(IUserDaoMapper.class);
		try
		{
			UserBean user = mapper.selectUserById(id);
			logger.debug("根据用户Id:{},查询用户信息:{}" + new Object[] { id, user });
			session.commit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			session.rollback();
		}
		finally
		{
			session.close();
		}
	}

	/**
	 * 查询所有的用户
	 */
	public void selectAllUser()
	{
		SqlSession session = DBTools.getSession();
		IUserDaoMapper mapper = session.getMapper(IUserDaoMapper.class);
		try
		{
			List<UserBean> user = mapper.selectAllUser();
			logger.debug("获取所用的用户:{}" + user);
			session.commit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			session.rollback();
		}
		finally
		{
			session.close();
		}
	}

	public UserBean getUserbyName(String username) throws Exception
	{
		SqlSession session = DBTools.getSession();
		IUserDaoMapper mapper = session.getMapper(IUserDaoMapper.class);
		UserBean user = null;
		try
		{
			// List<UserBean> users = mapper.selectAllUser();
			// logger.debug("获取所用的用户:{}", users);
			List<UserBean> users = mapper.getUserbyName(username);
			if (users.size() == 0)
			{
				logger.info("users: no found ");
			}
			logger.info("users:" + users.get(0).toString());
			session.commit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			session.rollback();
		}
		finally
		{
			session.close();
		}
		return user;
	}
}
