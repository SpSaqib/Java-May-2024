package InterviewQuestions;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int factorial=1;
		
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial of a number is : "+factorial);

	}

}
