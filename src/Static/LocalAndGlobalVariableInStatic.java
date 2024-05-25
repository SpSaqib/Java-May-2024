package Static;

public class LocalAndGlobalVariableInStatic {
	
	static String name="Karnataka";
	static String name1;
	
	String name2="Hi";
	
	public static void main(String[] args) 
	{
		// if local and global variables are same then preference will go to local variable
		String name3="Saqib";
		System.out.println(name);
		
		System.out.println(LocalAndGlobalVariableInStatic.name);
		
		System.out.println(name1);// null
		
		setName("Hello");
		
		System.out.println(name1); // Hello
	
	}
	
	public static void setName(String name1)
	{
		
		LocalAndGlobalVariableInStatic.name1=name1;
		
	}
	
	

}
