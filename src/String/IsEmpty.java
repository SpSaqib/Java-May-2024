package String;

public class IsEmpty {

	public static void main(String[] args) {
		String s1="";  
		String s2="javatpoint";  
		String s3=null;
		  
		System.out.println(s1.isEmpty());  
		System.out.println(s2.isEmpty());
		
		// NullPointerException
		System.out.println(s3.isEmpty());

	}

}
