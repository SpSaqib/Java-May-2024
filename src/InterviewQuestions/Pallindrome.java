package InterviewQuestions;

public class Pallindrome {

	public static void main(String[] args) 
	{
		reverseNumber(1234);
		reverseNumber(121);
		reverseNumber(303);
		reverseNumber(4356);

	}
	public static void reverseNumber(int num)
	{
		int rem=0;
		int rev=0;
		int originalValue=num;
		
		while(num!=0)
		{
			rem=num%10;//1,4,1
			
			rev=rev*10+rem;//1,14,141
			
			num=num/10;//14,1,0
		}
		
		if(originalValue==rev)
		{
			System.out.println("Number is pallindrome "+originalValue);
		}
		else
		{
			System.out.println("Number is not pallindrome "+originalValue);
		}
		
		
	}

}
