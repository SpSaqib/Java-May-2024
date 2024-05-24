package String;

public class Replace {

	public static void main(String[] args) {
		String s1="javatpoint is a very good website";  
		
		String replaceString=s1.replace("good","bad");//replaces all occurrences of 'a' to 'e' 
		
		System.out.println(replaceString);  
		
		String replaceString1=s1.replaceAll("a", "e");
		System.out.println(replaceString1);

	}

}
