import java.util.*;

public class Lab8Excercise3
{
	public static void main(String[] args)
	{
	whileLoop();
	System.out.println("");
	forLoop();
	}
	public static void whileLoop()
	{
		int i=3;
		while(i <= 30)
		{
			System.out.println(i);
			i+=3;
		}
	}
	public static void forLoop()
	{
		for(int i=3; i <= 30; i+=3)
		{
			System.out.println(i);
		}
	}
}

