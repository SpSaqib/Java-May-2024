package Operators;

public class CompoundAssignmentOprator {

	public static void main(String[] args) 
	{
		int a=10;
		
		a+=2*2;
		
		System.out.println(a);
		
		a-=2*2;
		System.out.println(a);//14-6
		
		a*=2+5;
		
		System.out.println(a);//70

	}

}
