package mulitipThread;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WoWTeam implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WoWTeam(String teamName)
	{
		this.setTeamName(teamName);
	}

	private String teamName;

	private List<String> users = new ArrayList<String>();

	private double damage;

	public String getTeamName()
	{
		return teamName;
	}

	public void setTeamName(String teamName)
	{
		this.teamName = teamName;
	}

	public List<String> getUsers()
	{
		return users;
	}

	public void setUsers(List<String> users)
	{
		this.users = users;
	}

	public double getDamage()
	{
		return damage;
	}

	public void setDamage(double damage)
	{
		this.damage = damage;
	}

	public double outputDamage()
	{
		this.damage = Math.random() * 100;
		return this.damage;
	}

}
