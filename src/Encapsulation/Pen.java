package Encapsulation;

public class Pen {

	private String color;
	private String type;
	
	private void write()
	{
		System.out.println("From write method");
	}
	
	public void printColor()
	{
		write();
		System.out.println(this.color);
	}
	
	public void set(String type)
	{
		this.type=type;
	}
	public String get() // String get()=ballpoint
	{
		return type;
	}

	public static void main(String[] args) 
	{
		Pen p1=new Pen();
		p1.printColor();
		p1.write();
		
	}
}
