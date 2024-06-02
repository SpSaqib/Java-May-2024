package Encapsulation;

public class Encapsulation1 
{
	// we can achieve security here
	// wrapping attributes=Variables and behaviors=Methods
	
	String name;
	private int age;
	
	// getter and setter
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public int getAge()// int getAge()=age;
	{
		return age;
	}
	
	public static void main(String[] args) 
	{
		Encapsulation1 e1=new Encapsulation1();
		
		System.out.println(e1.getAge());
		
		e1.setAge(10);
		System.out.println(e1.getAge());
		
		Encapsulation1 e2=new Encapsulation1();
		e2.age=20;
		System.out.println(e2.age);
	}

}
