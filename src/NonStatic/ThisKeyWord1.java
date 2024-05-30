package NonStatic;

public class ThisKeyWord1 {
	
	int i=10;
	
	public void demo()
	{
		System.out.println("I am from demo method");
		int i=100;
		System.out.println(i);
		System.out.println(this.i);
	}

	public static void main(String[] args) 
	{
		ThisKeyWord1 t1=new ThisKeyWord1();
		t1.demo();
		System.out.println(t1.i);
		
	}

}
