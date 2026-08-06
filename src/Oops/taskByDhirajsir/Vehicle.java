package Oops.taskByDhirajsir;

public class Vehicle 
{
	String brand;
	int speed;
	
	public Vehicle(String brand , int speed)
	{
		this.brand = brand;
		this.speed = speed;
	}
	
	void displayInfo()
	{
		System.out.println(brand + " " + speed);
	}
}
