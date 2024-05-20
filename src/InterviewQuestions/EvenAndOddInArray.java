package InterviewQuestions;

public class EvenAndOddInArray {

	public static void main(String[] args) 
	{
		int[] a= {10,12,15,18,98,75,57,51,54,65,63,95};
		
		int countEven=0;
		int countOdd=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				countEven++;
			}
			else
			{
				countOdd++;
			}

		}
		System.out.println("Even numbers in this Array : "+countEven);
		
		System.out.println("Odd numbers in this Array : "+countOdd);
		

	}

}
