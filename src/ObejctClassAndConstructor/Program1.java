package ObejctClassAndConstructor;

public class Program1 {
	
	// contrcutor: special method same name as class name
	
    Program1()
	{
		
	}

	public static void main(String[] args) 
	{
		// We can create an obejct with the help keyword called new, followed by constructor
		
		Program1 p = new Program1();
		System.out.println(p);
		
		Program1 p2 = new Program1();
		System.out.println(p2);
		
		System.out.println(new Program1());
		
	}

}
