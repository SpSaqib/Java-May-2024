package Operators;

public class DecrementsOperator {

	public static void main(String[] args) 
	{
		// Post decrement
		
		int a=10;
		
		System.out.println(a--);//10
		
		System.out.println(a);//9
		
		int i=100; // 98
		
		int j= i-- + i-- ; //100+99
		
		System.out.println(j);
		
		System.out.println(i);

	}

}
