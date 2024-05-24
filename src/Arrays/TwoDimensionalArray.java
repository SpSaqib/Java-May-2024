package Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) 
	{
		// Declaration
		int a[][]=new int[2][3];
		
		//
		a[0][0]=1;
		a[0][1]=3;
		a[0][2]=5;
		a[1][0]=2;
		a[1][1]=4;
		a[1][2]=6;
		
		
		System.out.println(a[0][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][0]);
		
		
		
		int b[][]= {{1,4,6},{1,2,5}};
		
		System.out.println(b[0][2]);
		
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				System.out.print(b[i][j]+" ");
			}
			
			System.out.println();
			
		}
		

	}

}
