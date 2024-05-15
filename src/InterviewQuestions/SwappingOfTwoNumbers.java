package InterviewQuestions;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		
		System.out.println("Before swpping of value of a : "+a);
		System.out.println("Before swpping of value of b : "+b);
		
		//first method
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		//Second method
//		a=a*b;//200
//		b=a/b;//10
//		a=a/b;//20
		
		// Third method
		
		b=a+b-(a=b);//10+20-20=10
		
		System.out.println("after swpping of value of a : "+a);
		System.out.println("after swpping of value of b : "+b);
		
		

	}

}
