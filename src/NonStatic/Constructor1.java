package NonStatic;

public class Constructor1 
{
	
	 void Constructor1()
	{
		System.out.println("I am from method");
	}

	 Constructor1()
	{
	   System.out.println("I am from constructor");
	}
	  
	public static void main(String[] args)
	{
		Constructor1 c= new Constructor1();
		
		c.Constructor1();		

	}

}
