package Polymorphism;

public class B extends A{
	
	int i=20;
	
	public void printName()
	{
		System.out.println("I am from B class");
	}

	public void getMyName()
	{
		System.out.println("I am from B class GetMy Name method");
	}
	public static void main(String[] args) 
	{
//		B b=new B();
//		System.out.println(b.i);
//		System.out.println(b.j);
//		b.printName();
//		b.myIntro();
//		b.displaySirName();
		
		// Upcasting
		A a=new B();       // A a=new A();
//		System.out.println(a.i);
//		System.out.println(a.j);
//		a.printName();  // Method Overriding- Non Static
//		a.myIntro();
//		a.displaySirName();
		
//		A a1=new A();       
//		System.out.println(a1.i);
//		System.out.println(a1.j);
//		a1.printName();  
//		a1.myIntro();
//		a1.displaySirName();
		
		
		B b1=(B) a; // B b1=new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
		b1.printName();  
		b1.myIntro();
		b1.displaySirName();
		b1.getMyName();
		
		
//		A a1=new A();
//		B b2=(B) a1;     // It will throw class cast exception
//		System.out.println(b2.i);
//		System.out.println(b2.j);
//		b2.printName();  
//		b2.myIntro();
//		b2.displaySirName();
//		b2.getMyName();
	}

}
