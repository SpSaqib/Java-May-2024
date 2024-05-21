package InterviewQuestions;

public class FindingIndexNumberInArray {

	public static void main(String[] args) 
	{
		int[] a= {2,3,4,5,6,4,30,35,65,60};
		
		int temp=6;
		
		for(int i=0;i<a.length;i++)
		{
			if(temp==a[i])
			{
				System.out.println(i);
				break;
				
			}
			
		}
		
		

	}

}
