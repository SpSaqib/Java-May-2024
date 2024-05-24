package InterviewQuestions;

public class SwppingOfString {

	public static void main(String[] args) {
		
		String str1 = "Hello";
        String str2 = "World";
        
        // Printing original values
        System.out.println("Before swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        
        // Swapping without using a temporary variable
        str1 = str1 + str2;          // str1 now holds "HelloWorld"
        str2 = str1.substring(0, str1.length() - str2.length()); // str2 now holds "Hello"
        str1 = str1.substring(str2.length());   // str1 now holds "World"
        
        // Printing swapped values
        System.out.println("After swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

	}

}
