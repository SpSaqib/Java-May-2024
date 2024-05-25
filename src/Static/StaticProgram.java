package Static;

public class StaticProgram {
	
	static int i=test(); //0,10,10
	
	public static void main(String[] args) 
	{
		System.out.println("I am from main : "+i);
		test();

	}
	
	public static int test()
	{
		System.out.println("I am from test : "+i);
		return 10;
	}

}
