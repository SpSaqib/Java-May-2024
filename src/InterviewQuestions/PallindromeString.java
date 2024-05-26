package InterviewQuestions;

public class PallindromeString {

	public static void main(String[] args) 
	{
		pallindromeString("Saqib");
		pallindromeString("Gadag");
		pallindromeString("MoM");

	}
	
	public static void pallindromeString(String originalString)
	{
		System.out.println("Given name : "+originalString);
		
		String reversedName="";
		
		for(int i=originalString.length()-1;i>=0;i--)
		{
			reversedName=reversedName+originalString.charAt(i);//Saqib
		}
		
		System.out.println("Reversed name : "+reversedName);
		
		if(originalString.equals(reversedName))
		{
			System.out.println("Given String is pallindrome ");
		}
		else
		{
			System.out.println("Given String is not pallindrome ");
		}
		
	}

}
