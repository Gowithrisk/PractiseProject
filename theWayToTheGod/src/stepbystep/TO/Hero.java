package stepbystep.TO;

import java.io.Serializable;

public class Hero implements Serializable
{
	public Hero(String name)
	{
		this.name = name;
	}

	private static final long serialVersionUID = 1L;

	private String name;

	private String sex;

	private double bloodMax;

	private double bloodCurrent;

	private boolean isDead;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSex()
	{
		return sex;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}

	public double getBloodMax()
	{
		return bloodMax;
	}

	public void setBloodMax(double bloodMax)
	{
		this.bloodMax = bloodMax;
	}

	public double getBloodCurrent()
	{
		return bloodCurrent;
	}

	public void setBloodCurrent(double bloodCurrent)
	{
		this.bloodCurrent = bloodCurrent;
	}

	public boolean isDead()
	{
		return isDead;
	}

	public void setDead(boolean isDead)
	{
		this.isDead = isDead;
	}

}
