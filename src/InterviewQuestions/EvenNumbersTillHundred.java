package InterviewQuestions;

public class EvenNumbersTillHundred {

	public static void main(String[] args) 
	{
		
		int n=1;
		int m=100;
		
		while(n<=m && n%2==0)
		{
			if(n%2==0)
			{
				System.out.println("Number is even : "+n);
			}
			n++;
		}

	}

}
