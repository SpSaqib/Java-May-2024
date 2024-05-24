package Static;


public class Static2 {
	
	static int d=50;

	public static void main(String[] args) 
	{
		//  we can call in static members of different with help of classname
		Static1.addition();
		
		// direcly we can call in same class
		divide();
		
		// Indirecly we can call in same class with help of classname
		Static2.divide();
		
		System.out.println(d);
		
		// Indirecly we can call in same class with help of classname
		System.out.println(Static1.c);

	}
	
	public static void divide()
	{
		Static1.subtraction();
	}


}
