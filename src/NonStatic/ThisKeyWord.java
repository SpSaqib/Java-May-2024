package NonStatic;

public class ThisKeyWord {
	
	void demo()
	{
		System.out.println(this);
	}

	public static void main(String[] args) 
	{
		ThisKeyWord t=new ThisKeyWord();// ==== this
		
		System.out.println(t);
		t.demo();

	}

}
