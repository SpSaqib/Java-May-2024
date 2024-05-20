package Methods;

public class MethodOverLoading1 {

	public static void main(String[] args) 
	{
		addition(10, 20, 30);

	}
	
	public static void addition(int a,int b)
	{
		int result=a+b;
		System.out.println(result);
	}
	
	
	public static void addition(int a,int b,int c)
	{

		int result=a+b+c;
		System.out.println(result);
	}
	
	public static void addition(int a,int b,int c, int d)
	{

		int result=a+b+c+d;
		System.out.println(result);
	}

}
