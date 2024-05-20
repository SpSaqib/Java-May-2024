package Methods;

public class MethodOverLoading2 {

	public static void main(String[] args) 
	{
		studentDetails(123);
		studentDetails(1234, "Saqib");
		studentDetails(12345, "Rahul",true);

	}
	public static String studentDetails(int rollNo)
	{
		System.out.println(rollNo);
		return null;
		
	}
	
	public static String studentDetails(int rollNo, String name)
	{
		System.out.println(rollNo);
		System.out.println(name);
		return null;
		
	}
	
	public static String studentDetails(int rollNo, String name, boolean maleGender)
	{
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(maleGender);
		return null;
		
	}
	

}
