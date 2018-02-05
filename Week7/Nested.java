public class Nested
{
	public static void main(String[] args)
	{
	//Print out all the points from (0,0) to (4,4)
	for(int i = 0; i<5;i++)
	{
		for(int j = 0;j<5;j++)
		{
			System.out.print("x-coord= " + i);
			System.out.println(", y-coord= " + j);
		}
	}
	}
}