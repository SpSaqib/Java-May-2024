package Polymorphism;

public class SavingsAccount extends Accounts{
	
	int i=100;
	String name="Jamkhandi";
	String staticName="My Sir name from SavinsAccount";
	
	public void printIntro()
	{
		System.out.println("Print my intro from SavingsAccounts");
	}

	public static void main(String[] args) {
		
		SavingsAccount S1=new SavingsAccount();
		System.out.println(S1.i);
		System.out.println(S1.name);
		System.out.println(S1.staticName);
		S1.printIntro();
		
		
		Accounts A1=new SavingsAccount();  //upcasting
		
		System.out.println(A1.i);
		System.out.println(A1.name);
		System.out.println(A1.staticName);
		A1.printIntro();

	}

}
