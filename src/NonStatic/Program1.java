package NonStatic;



public class Program1 {
	
	int ram;
	String name;
	int memorySize;
	

	public static void main(String[] args) 
	{
	//	System.out.println(ram);
		
		Program1 p1 = new Program1();
		
		System.out.println(p1.ram);
		System.out.println(p1.name);
		System.out.println(p1.memorySize);
		
		p1.ram=10;
		p1.name="Dell";
		p1.memorySize=500;
		
		System.out.println(p1.ram);
		System.out.println(p1.name);
		System.out.println(p1.memorySize);
		
		Program1 p2 = new Program1();
		
		System.out.println(p2.ram);
		System.out.println(p2.name);
		System.out.println(p2.memorySize);
		
		p2.ram=16;
		p2.name="HP";
		p2.memorySize=1000;
		
		System.out.println(p2.ram);
		System.out.println(p2.name);
		System.out.println(p2.memorySize);

	}

}
