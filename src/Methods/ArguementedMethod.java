package Methods;

// Arguenment method or Parameterised method

public class ArguementedMethod {
	

	public static void main(String[] args) 
	{
		int sub=subtraction(30, 20);
		int a=10;
		
		int result=a+subtraction(40, 20)+sub;
		System.out.println(result);
	}
	
	public static int addtionOfTwoNumbers(int a, int b)
	{
			int result=a+b;
			System.out.println(a);
			System.out.println(b);
			System.out.println(result);
			return result;
	}
	
	public static int subtraction(int c,int d)
	{
	   int result=c-d;
	   return result;
	}

}
