package mulitipThread;

public class FubenBoss
{
	private String boss;

	private double bloodNum = 100;

	private boolean isDead = false;

	public void dropBlood(double damges)
	{
		if (this.bloodNum <= damges)
		{
			this.bloodNum = 0;
			this.isDead = true;
		}
		this.bloodNum = this.bloodNum - damges;
	}

	public String getBoss()
	{
		return boss;
	}

	public void setBoss(String boss)
	{
		this.boss = boss;
	}

	public double getBloodNum()
	{
		return bloodNum;
	}

	public void setBloodNum(double bloodNum)
	{
		this.bloodNum = bloodNum;
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
