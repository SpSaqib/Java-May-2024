package InterviewQuestions;

public class LargestOfTwoNumbers {

	public static void main(String[] args) 
	{
		largest(10, 20);
		largest(100,100);
		
	}
	
	public static void largest(int a,int b)
	{
		if(a>b)
		{
			System.out.println("A is largest");
		}
		
		else if(a==b)
		{
			System.out.println("A and B are equal");
		}
		
		
		else
		{
			System.out.println("B is largest");
		}
		
	}

}
