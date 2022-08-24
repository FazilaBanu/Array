package array.org;

public class Arrayforloop 
{
	public static void main(String[] args)
	{
		int[][] num = {{1,2,3}, {4,5,6},{7,8,9}};
		System.out.println("Two dimensional array");
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				System.out.print(num[i][j] + "\t");
			}
			System.out.println("");
		}
	}

}
