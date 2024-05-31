package NonStatic;

public class Constructor3 
{
	int id;
	String name;
	int price;
	
	Constructor3()
	{
		System.out.println("I am user defined");
	}
	
	Constructor3(int id,String name)
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	Constructor3(int id,String name, int price)
	{
		
		this.id=id;
		this.name=name;
		this.price=price;
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
	}

	public static void main(String[] args) 
	{
		
		Constructor3 c1=new Constructor3(); 
		
		Constructor3 c2=new Constructor3(1,"RD PD");
		
		Constructor3 c3=new Constructor3(100, "Mein Kempf", 500);
		
		Constructor3 c4=new Constructor3(200, "I am Malala", 1000);
	}

}
