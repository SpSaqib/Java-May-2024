package ScannerClasses;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		String line=s.nextLine();
		System.out.println(line);
		
		char c=s.next().charAt(0);
		System.out.println(c);

	}

}
