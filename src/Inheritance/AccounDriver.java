package Inheritance;

public class AccounDriver extends LoanAccount {
	
	public static void main(String[] args) 
	{
		
		LoanAccount la=new LoanAccount();
		
		System.out.println(la.acc_holder_Name);
		System.out.println(la.acc_No);
		System.out.println(la.ifsc);
		
		System.out.println(la.loan_Amount);
		
		AccounDriver ad=new AccounDriver();
		
		System.out.println(ad.loan_Amount);
		System.out.println(ad.acc_No);
		
	}


}
