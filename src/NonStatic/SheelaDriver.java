package NonStatic;

public class SheelaDriver {

	public static void main(String[] args) 
	{
		// Duri9ng the loading process of an object if static block is there then static will be loaded
		Sheela s=new Sheela();
		Sheela s1=new Sheela();
		Sheela s2=new Sheela();
		
		s.dance();
		


	}

}
