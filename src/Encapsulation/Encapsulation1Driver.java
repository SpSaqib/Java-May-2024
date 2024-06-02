package Encapsulation;

public class Encapsulation1Driver {

	public static void main(String[] args) 
	{
		Encapsulation1 e1=new Encapsulation1();
//		e1.age=20;
//		e1.name="Saqib";
	//	System.out.println(e1.age);
		
		Encapsulation1 e2=new Encapsulation1();
		
		System.out.println(e2.getAge());
		
		e2.setAge(10);
		System.out.println(e2.getAge());
		
		

	}

}
