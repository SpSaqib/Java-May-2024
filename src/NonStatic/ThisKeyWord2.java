package NonStatic;

public class ThisKeyWord2 {
	
	// General purpose integrate local and global variable
	
	String name;
	
	public void setName(String name)
	{		
		this.name=name;
	}
	
	public void displayeName()
	{		
		String name2="Hyderabad";
		
		System.out.println(name);
	}
	
	public void displayeName1()
	{		
		String name="Hyderabad";
		
		System.out.println(name);
		System.out.println(this.name);
	}
	

	public static void main(String[] args) 
	{
		ThisKeyWord2 t1=new ThisKeyWord2();
		
		t1.setName("Delhi");
		
		t1.displayeName();
		t1.displayeName1();
		
		
	}

}
