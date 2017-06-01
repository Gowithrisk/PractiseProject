package mapper;

import java.util.List;

import Entity.UserBean;

public interface IUserDao {
	/**
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public int insertUser(UserBean user) throws Exception;

	/**
	 * 
	 * @param user
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int updateUser(UserBean user, int id) throws Exception;

	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int deleteUser(int id) throws Exception;

	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public UserBean selectUserById(int id) throws Exception;

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<UserBean> selectAllUser() throws Exception;

	/**
	 * 
	 * @param username
	 * @return
	 * @throws Exception
	 */
	public List<UserBean> getUserbyName(String username) throws Exception;

}
