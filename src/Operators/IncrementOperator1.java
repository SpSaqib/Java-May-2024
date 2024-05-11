package Operators;

public class IncrementOperator1 {

	public static void main(String[] args) 
	{
		int a=20,b=13;
		
		int sum= a++ + ++b;// 34
		
		int result = ++a - b++; //22 - 14=8
		
		System.out.println(sum);//34
		
		System.out.println(result);//8
		
		System.out.println(a);//22
		
		System.out.println(b);// 15

	}

}
