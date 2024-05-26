package InterviewQuestions;

public class ReverseString {

	public static void main(String[] args) 
	{
		reverseString("Saqib");
		
	}
	
	public static void reverseString(String name)
	{
		System.out.println("Given name : "+name);
		
		String reversedName="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			reversedName=reversedName+name.charAt(i);//Saqib
		}
		
		System.out.println("Reversed name : "+reversedName);
		
		
		
	}

}
