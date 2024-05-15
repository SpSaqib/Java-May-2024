package InterviewQuestions;

public class NumberIsEvenOrOdd {

	public static void main(String[] args) 
	{
		evenOdd(33);
		evenOdd(34);
		evenOdd(35);
		evenOdd(36);
		evenOdd(37);
	}
	
	public static void evenOdd(int a)
	{
		if(a%2==0)
		{
			System.out.println("a is even");
		}
		else
		{
			System.out.println("a is odd");
		}
	}
	
	

}
