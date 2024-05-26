package InterviewQuestions;

public class NumbersIsPrimeOrNot {

	public static void main(String[] args) 
	{
		numberIsPrime(7);
		numberIsPrime(1);
		numberIsPrime(6);
		numberIsPrime(-50);
	}
	public static void numberIsPrime(int num)
	{
		int count=0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("Number is  a prime number");
			}
			else
			{
				System.out.println("Number is not a prime number");
			}	
		}
		else
		{
			System.out.println("Number is not a prime number");
		}
		
	}

}
