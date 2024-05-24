package String;

public class CharAT {

	public static void main(String[] args) 
	{
		String s="Karnataka";
		
		char s1 = s.charAt(3);
		System.out.println(s1);
		System.out.println(s.charAt(4));
		
		//StringIndexOutOfBoundsException
		System.out.println(s.charAt(9));

	}

}
