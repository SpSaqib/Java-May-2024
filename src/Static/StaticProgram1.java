package Static;

public class StaticProgram1 {
	
	static int i=test1();
	static int j=test1()+test2();
	public static int test1()
	{
		System.out.println("I am from test1 i : "+i);//0,10
		System.out.println("I am from test1 j : "+j);//0,0
		System.out.println("======================");
		return 10;
	}
	public static int test2()
	{
		System.out.println("I am from test2 i : "+i);//10
		System.out.println("I am from test2 j : "+j);//0
		System.out.println("======================");//
		return test1()-3;
	}
	public static void main(String[] args) 
	{
		System.out.println("I am from main i : "+i);//10
		System.out.println("I am from main j : "+j);//17
	}

}
