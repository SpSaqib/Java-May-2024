package Methods;

public class ReturnType1 
{
	public static int addition()
	{
		return 100;
	}
	// int a=10
	// int addition=100
	
	public static int addition1()
	{
		int a=20;
		int b=30;
		System.out.println(b);
		return a;
	}
	// int b=20;
	// int a=b;
	// int addition1=a;//20
	
	public static void main(String[] args) 
	{
		addition();
		addition1();
		System.out.println(addition());
	}
	

}
