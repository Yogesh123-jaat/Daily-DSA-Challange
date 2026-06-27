package Oops.Encapsulation;

public class Employees 
{
	private int id;
	private String name;
	private int salary;
	private String dsgn;
	private String orgName;
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	public void setDsgn(String dsgn)
	{
		this.dsgn = dsgn;
	}
	
	public void setOrgName(String orgName)
	{
		this.orgName = orgName;
	}
	
	// getters (Mutators)
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public String getDsgn()
	{
		return dsgn;
	}
	
	public String getOrgName()
	{
		return orgName;
	}
}
