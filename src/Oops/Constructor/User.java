package Oops.Constructor;

public class User 
{
	String name;
	String phone;
	String email;

	User(String phone)
	{
		this(phone , "Guest User");
	}
	
	User(String phone , String name)
	{
		this(phone , name , "Not Provided");
	}
	
	User(String phone , String name , String email)
	{
		this.phone = phone;
		this.name = name;
		this.email = email;
	}
	
	public void dispData()
	{
		System.out.println(phone + " " + name + " " + email);
	}
	
	public static void main(String[] args) 
	{
		User u1 = new User("8141687461");
		User u2 = new User("8141687461" , "Yogesh");
		User u3 = new User("8141687461" , "Yogesh" , "yc307328@gmail.com");
		
		u1.dispData();
		u2.dispData();
		u3.dispData();
	}

}
