package Static;

public class Static4 {
	
	static int a=10;
	
	static
	{
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		System.out.println("Hi");
		display();
	}
	
	public static void display()
	{
		System.out.println("Hello");
	}

}
