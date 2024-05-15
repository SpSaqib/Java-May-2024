package Methods;

// Arguenment method or Parameterised method

public class ArguementedMethod {
	

	public static void main(String[] args) 
	{
		int sum=addtionOfTwoNumbers(10,30)+addtionOfTwoNumbers(50, 100)-subtraction(200,50);
		System.out.println(sum);
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
