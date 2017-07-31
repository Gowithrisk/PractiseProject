package bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Zus
{
	private String name;

	private int speed;

	private int itelegent;

	private List<String> uniqueSkill = new ArrayList<String>();

	private Map<String, String> keySkill = new HashMap<String, String>();

	public void killingSpring()
	{
		System.out.println("killing Spring");
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void setSpeed(int speed)
	{
		this.speed = speed;
	}

	public int getItelegent()
	{
		return itelegent;
	}

	public void setItelegent(int itelegent)
	{
		this.itelegent = itelegent;
	}

	public List<String> getUniqueSkill()
	{
		return uniqueSkill;
	}

	public void setUniqueSkill(List<String> uniqueSkill)
	{
		this.uniqueSkill = uniqueSkill;
	}

	public Map<String, String> getKeySkill()
	{
		return keySkill;
	}

	public void setKeySkill(Map<String, String> keySkill)
	{
		this.keySkill = keySkill;
	}

	@Override
	public String toString()
	{
		return "Zus [name=" + name + ", speed=" + speed + ", itelegent=" + itelegent + ", uniqueSkill=" + uniqueSkill
				+ ", keySkill=" + keySkill + "]";
	}

}
