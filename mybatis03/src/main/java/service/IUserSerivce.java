package service;

import Entity.UserBean;

public interface IUserSerivce
{

	// boolean insertUser() throws Exception;

	/**
	 * 删除用户
	 */
	boolean deleteUser(int id) throws Exception;

	/**
	 * 根据id查询用户
	 */
	void selectUserById(int id) throws Exception;

	/**
	 * 查询所有的用户
	 */
	void selectAllUser() throws Exception;

	/**
	 * 
	 * @param username
	 * @return
	 * @throws Exception
	 */
	UserBean getUserbyName(String username) throws Exception;
}
