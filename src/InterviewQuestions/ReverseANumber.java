package InterviewQuestions;

public class ReverseANumber {

	public static void main(String[] args) 
	{
		
		reverseNumber(141);
	}

	public static void reverseNumber(int num)
	{
		int rem=0;
		int rev=0;
		
		while(num!=0)
		{
			rem=num%10;//1,4,1
			
			rev=rev*10+rem;//1,14,141
			
			num=num/10;//14,1,0
		}
		
		System.out.println(rev);
		
	}
}
