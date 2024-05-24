package String;

public class EqualsOperator {

	public static void main(String[] args) {
		String s1="javatpoint";  
		String s2="javatpoint";  
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		String s3= new String("javatpoint");
		//It will check the value
		System.out.println(s1.equals(s3));
		
		// It will check the object reference value
		System.out.println(s1==s3);
		

	}

}
