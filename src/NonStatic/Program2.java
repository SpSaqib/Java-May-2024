package NonStatic;

public class Program2 {
	
	int ram;
	String name="HP";
	int memorySize=2000;

	public static void main(String[] args) 
	{
		Program2 p1 = new Program2();
		
		System.out.println(p1.ram);
		System.out.println(p1.name);
		System.out.println(p1.memorySize);
		
		Program2 p2 = new Program2();
		
		System.out.println(p2.ram);
		System.out.println(p2.name);
		System.out.println(p2.memorySize);

	}

}
