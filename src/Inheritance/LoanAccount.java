package Inheritance;

public class LoanAccount extends Account
{
	
	double loan_Amount;
	
	public static void main(String[] args) {
		LoanAccount a=new LoanAccount();
		
		System.out.println(a.loan_Amount);
		System.out.println(a.acc_holder_Name);
		System.out.println(a.ifsc);
		
	}

}
