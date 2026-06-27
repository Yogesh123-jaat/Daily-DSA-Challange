package Oops.Encapsulation;

public class TestApp1 {

	public static void main(String[] args) 
	{
		Employees emp = new Employees();
		
		emp.setId(1);
		emp.setName("Yogesh");
		emp.setSalary(25000);
		emp.setOrgName("ABC");
		emp.setDsgn("CEO");
		
		
		System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getDsgn() + " " + emp.getOrgName());
	}

}
