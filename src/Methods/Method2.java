package Methods;

public class Method2 
{
	public static void morningWalk()
	{
		System.out.println("I went to morning walk");
	}

	public static void eveningWalk()
	{
		System.out.println("I went to evening walk");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("I went to market");
		eveningWalk();
		afterNoonWalk();
		morningWalk();
	}
	
	public static void afterNoonWalk()
	{
		System.out.println("I went to afternoon walk");
	}
}
