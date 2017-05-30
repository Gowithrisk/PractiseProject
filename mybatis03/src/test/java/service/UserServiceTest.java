package service;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Entity.UserBean;

public class UserServiceTest
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
	}

	@Before
	public void setUp() throws Exception
	{
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void testInsertUser() throws Exception
	{
		UserService userService = new UserService();
		UserBean user = new UserBean("test02", "123456");
		userService.insertUser(user);
		userService.getUserbyName("test02");
	}

	@Test
	public void testDeleteUser()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSelectUserById()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSelectAllUser()
	{
		fail("Not yet implemented");
	}

}
