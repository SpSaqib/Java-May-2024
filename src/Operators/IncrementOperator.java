package Operators;

public class IncrementOperator {

	public static void main(String[] args) 
	{
		int a=10;
		
		System.out.println(a++);// +1
		
		
		System.out.println(a); // 11
		
		int i=100;//101,102
		
		int j=i++ + i++ ; //100+101=201
		
		
		
		
		
		
		
		
		System.out.println(i);
		System.out.println(j); //102
		
		int s=10;
		
		System.out.println(++s);//11
		
		int p= ++s + ++s;//12+13
		
		System.out.println(p);
	
	}

}
