package NonStatic;

public class Program3 {
	
	static int i=10;
	int j=20;
	
	public void demo()
	{
		System.out.println(i);
		System.out.println(j);
	}
	

	public static void main(String[] args) 
	{
		displayNameFromStatic();
		
		
		Program3 p1=new Program3();
		p1.printName();
		p1.demo();
				
		p1.displayNameFromStatic();
		
		Program3.displayNameFromStatic();

	}
	
	public void printName()
	{
		System.out.println("I am from non static");
		
		printName1();
		
	}
	
	public  void printName1()
	{
		System.out.println("I am from non static 1");
	}
	
	public static void displayNameFromStatic()
	{
		System.out.println("I am from Static");
		
	}

}
