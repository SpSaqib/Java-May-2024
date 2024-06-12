package abstaction;

//We cant create multple inheritacnce in Abstraction
public class Abtraction3 extends Abstraction1
{

	@Override
	public int add(int a, int b) 
	{
		System.out.println(" I am from int method");
		
		return 0;
	}

	public static void main(String[] args)
	{
		
		Abtraction3 ab=new Abtraction3();
		ab.add(0, 0);
		ab.helloWorld();
		
		
	}
	

	
	}




