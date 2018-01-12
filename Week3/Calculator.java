import java.util.Scanner;

public class Calculator
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Input first integer.");
		int a = scan.nextInt();		
		System.out.println("Input second integer.");
		int b = scan.nextInt();
		System.out.println(add(a, b));
		System.out.println(subtract(a,b));
		System.out.println(multiply(a,b));
		System.out.println(divide(a,b)); 

	}
	public static int add(int a, int b)
	{
			int c = (a+b);
			return c;
	}
	public static int subtract(int a, int b)
	{
			int c = (a-b);
			return c;
	}
	public static int multiply(int a, int b)
	{
			int c = (a*b);
			return c;
	}
	public static int divide(int a, int b)
	{
			int c = (a/b);
			return c;
	}
}