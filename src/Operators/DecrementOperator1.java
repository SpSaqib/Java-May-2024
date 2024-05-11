package Operators;

public class DecrementOperator1 {

	public static void main(String[] args) {
		
		int a=20,b=13;
		
		int sum= a-- + --b; // 32
		
		int result = --a - b--; //6
		
		System.out.println(sum);
		
		System.out.println(result);
		
		System.out.println(a);//18
		
		System.out.println(b); //11

	}

}
