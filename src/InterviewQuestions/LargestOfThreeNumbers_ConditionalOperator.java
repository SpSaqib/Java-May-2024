package InterviewQuestions;

public class LargestOfThreeNumbers_ConditionalOperator {

	public static void main(String[] args) 
	{
		int a=10,b=30,c=40;
		
		int largest1=a>b? a:b;
		
		int largest=largest1>c? largest1:c;
		
		System.out.println(largest);

	}

}
