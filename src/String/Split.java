package String;

public class Split {

	public static void main(String[] args) {
		
		String s1="Java is the best language";
		
		String[] s2=s1.split("is");
		
		for(int i=0;i<s2.length;i++)
		{
			System.out.println(s2[i]);
		}
		
	//	String[] s2= {"Java "," the best language"};

	}

}
