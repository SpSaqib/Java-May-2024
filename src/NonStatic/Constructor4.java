package NonStatic;

public class Constructor4 {// this call statement: constructor chaining
	
	String name;
	String USN;
	int age;
	String Stream;
	
	Constructor4()
	{
		System.out.println("Hi I am from Default constructor");
	}
	
	Constructor4(String name)
	{
		this();
		this.name=name;
		System.out.println("Hi I am from String constructor");
	}
	
	Constructor4(String name,String USN)
	{
		this(name);
		this.USN=USN;
		System.out.println("Hi I am from String and USN constructor");
	}
	
	Constructor4(String name,String USN,int age)
	{
		this(name,USN);
		this.age=age;
		System.out.println("Hi I am from String and USN and age constructor");
	}
	
	public void displayDetails()
	{
		System.out.println(name);
		System.out.println(USN);
		System.out.println(age);
	}
	
	

	public static void main(String[] args) 
	{
	//	Constructor4 c1=new Constructor4("Rahul");
		
	//	Constructor4 c2=new Constructor4("Rajesh","ABC123");
		
		Constructor4 c3=new Constructor4("Rajesh","ABC123",50);
		c3.displayDetails();

	}

}
