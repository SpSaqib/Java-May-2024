package Inheritance;

public class EngineHasA {
	
	int mileage;
	String chasseaName;
	int weight;
	int CC;
	
	EngineHasA(int mileage,String chasseaName,int weight,int CC)
	{
		this.mileage=mileage;
		this.chasseaName=chasseaName;
		this.weight=weight;
		this.CC=CC;
	}
	
	public void engineAttributeDetails()
	{
		System.out.println(mileage);
		System.out.println(chasseaName);
		System.out.println(weight);
		System.out.println(CC);
	}

}
