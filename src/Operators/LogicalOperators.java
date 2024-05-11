package Operators;

public class LogicalOperators {

	public static void main(String[] args) 
	{
		    boolean x = true;
		    
	        boolean y = false;
	        
	        // Using AND operator
	        boolean result1 = x && y; // result1 will be false

	        // Using OR operator
	        boolean result2 = x || y; // result2 will be true

	        // Using NOT operator
	        boolean result3 = !x; // result3 will be false
	        
	        boolean result4=!y;

	        System.out.println("Result of AND operation: " + result1);
	        System.out.println("Result of OR operation: " + result2);
	        System.out.println("Result of NOT operation: " + result3);
	        System.out.println("Result of NOT operation: " + result4);

	}

}
