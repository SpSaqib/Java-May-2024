package String;

public class EqualsIgnoreCase {

	public static void main(String[] args) 
	{
		String s1="javatpoint";  
		String s2="javatpoint";  
		String s3="JAVATPOINT";  
		String s4="python";  
		System.out.println(s1.equals(s2));//true because content and case is same  
		System.out.println(s1.equalsIgnoreCase(s3));//true 
		
		

	}

}
