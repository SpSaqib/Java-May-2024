package Static;

public class Static1 {
	
	static int c=20;
	
	static
	{
		addition();
	}
	
	public static void main(String[] args) 
	{
		int a=10;
		addition();
		
		// static variables we can use directly in same class
		System.out.println(c);
		
//		We can non static members with the help object reference
//		multiplication();

		
	}
	
	public static void addition()
	{
		int a=10;
		int b=20;
		int result=a+b+c;
		subtraction();
		
	}
	
	public static void subtraction()
	{
		int a=10;
		int b=20;
	}
	
	// static members can be used in anywhere even in non static
	public void multiplication()
	{
		// we cant create static variables in non static members
		// static int c=30; // CTE
		int a=10;
		int b=20;
		addition();
	}

}
