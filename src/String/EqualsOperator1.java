package String;

public class EqualsOperator1 {

	public static void main(String[] args) {
	
		String s1 = "Hello";
		 String s2 = "World";
		 String s3 = s1+s2;
		 
		 String s4 = "HelloWorld";
		 String s5 = "HelloWorld";
		 System.out.println(s3==s4);
		 System.out.println(s4==s5);
		 System.out.println(s3.equals(s4));

	}

}
