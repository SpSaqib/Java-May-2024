package InterviewQuestions;

import java.util.Scanner;

public class NumberOfDigitsInANumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int count=0;
		
		while(a>0)
		{
			a=a/10;
			count++;
		}
		
		
		System.out.println(count);

	}

}
