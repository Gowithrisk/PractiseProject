package dao.impl;

import Entity.UserInfo;

public interface IUserDao
{
	UserInfo findUserById(String id);
}
