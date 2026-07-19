package Exception.BuiltInRunTime;

public class TestApp1 
{
	public static void main(String[] args)
	{
		String name = null;
		
		System.out.println(name.length());  // NullPointerException
	}
}

class NFEDemo 
{
    public static void main(String[] args) 
    {
        String age = "abc";
        int num = Integer.parseInt(age);   // NumberFormatException
    }
}

class CCEDemo 
{
    public static void main(String[] args) 
    {
        Object obj = "Hello";   // ye actually ek String hai
        Integer num = (Integer) obj;   // ClassCastException, kyunki ye String hai, Integer nahi
    }
}

class NASEDemo 
{
    public static void main(String[] args)
    {
        int size = -5;
        int[] arr = new int[size];   // NegativeArraySizeException
    }
}

class IAEDemo 
{
    public static void setAge(int age) 
    {
        if (age < 0)
        {
            throw new IllegalArgumentException("Age negative nahi ho sakti: " + age);
        }
        System.out.println("Age set: " + age);
    }

    public static void main(String[] args)
    {
        setAge(-10);
    }
}