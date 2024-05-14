package Methods;

public class ReturnType {

	public static void main(String[] args) 
	{
		subtraction();
		multiplication();
		System.out.println(multiplication());
		
	}
	
	public static void addtion()
	{
		int a,b,sum;
		
		a=10;
		b=20;
		
		sum=a+b;
		System.out.println(sum);
	}
	
	public static void subtraction()
	{
			int a=20;
			int b=10;
		int sum=a-b;
		System.out.println(sum);
		
		// for void you can use return keyword or not as well
		return ;
		
	}
	
	public static int multiplication()
	{
		int a=5;
		int b=10;
			
		int	multiply=a*b;
	
		System.out.println(a);
		System.out.println(b);
		return multiply;
		
	}

	// int multiplication=multiply;
}
