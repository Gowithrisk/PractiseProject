package Entity;

import java.io.Serializable;

public class UserInfo implements Serializable
{

	public UserInfo(String id, String password)
	{
		super();
		this.id = id;
		this.password = password;
	}

	public UserInfo()
	{
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -4360607421836713591L;

	private String id;
	private String userName;
	private String relative;
	private String password;

	public String getUserID()
	{
		return id;
	}

	public void setUserID(String id)
	{
		this.id = id;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getRelative()
	{
		return relative;
	}

	public void setRelative(String relative)
	{
		this.relative = relative;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

}
