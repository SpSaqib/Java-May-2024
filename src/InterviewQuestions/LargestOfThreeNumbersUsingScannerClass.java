package InterviewQuestions;

import java.util.Scanner;

public class LargestOfThreeNumbersUsingScannerClass {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
				
		int largest1=a>b? a:b;
		
		int largest=largest1>c? largest1:c;
		
		System.out.println(largest);
		
		

	}

}
