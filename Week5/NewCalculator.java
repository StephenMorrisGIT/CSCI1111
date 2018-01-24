import java.util.*;

public class NewCalculator
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Input first double.");
		double a = scan.nextDouble();		
		System.out.println("Input second double.");
		double b = scan.nextDouble();
		System.out.println("Input third double.");
		double c = scan.nextDouble();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Input first operation (+, -, *, /)");
		String operation1 = scan2.nextLine();
		System.out.println("Input second operation (+, -, *, /)");
		String operation2 = scan2.nextLine();
		double firstOperation = 0.0;
		double secondOperation = 0.0;
		
		
		if(operation1.equals("+"))
		{
		firstOperation = add(a, b, c);
			if(operation2.equals("+"))
			{
			secondOperation = (firstOperation+c);
			}
			else if (operation2.equals("-"))
			{
			secondOperation = (firstOperation-c);
			}
			else if (operation2.equals("*"))
			{
			secondOperation = (firstOperation*c);
			}
			else if (operation2.equals("/"))
			{
			secondOperation = (firstOperation/c);
			}
		}
		else if (operation1.equals("-"))
		{
		firstOperation = subtract(a, b, c);
			if(operation2.equals("+"))
			{
			secondOperation = (firstOperation+c);
			}
			else if (operation2.equals("-"))
			{
			secondOperation = (firstOperation-c);
			}
			else if (operation2.equals("*"))
			{
			secondOperation = (firstOperation*c);
			}
			else if (operation2.equals("/"))
			{
			secondOperation = (firstOperation/c);
			}
		}
		else if (operation1.equals("*"))
		{
		firstOperation = multiply(a, b, c);
			if(operation2.equals("+"))
			{
			secondOperation = (firstOperation+c);			}
			else if (operation2.equals("-"))
			{
			secondOperation = (firstOperation-c);
			}
			else if (operation2.equals("*"))
			{
			secondOperation = (firstOperation*c);
			}
			else if (operation2.equals("/"))
			{
			secondOperation = (firstOperation/c);
			}
		}
		else if (operation1.equals("/"))
		{
		firstOperation = divide(a, b, c);
			if(operation2.equals("+"))
			{
			secondOperation = (firstOperation+c);
			}
			else if (operation2.equals("-"))
			{
			secondOperation = (firstOperation-c);
			}
			else if (operation2.equals("*"))
			{
			secondOperation = (firstOperation*c);
			}
			else if (operation2.equals("/"))
			{
			secondOperation = (firstOperation/c);
			}
		}
		
		System.out.println(firstOperation);
		System.out.println(secondOperation);
		
	}
	
	public static double add(double a, double b, double c)
	{
	double d = (a+b);
	return d;
	}
	
	public static double subtract(double a, double b, double c)
	{
	double d = (a-b);
	return d;
	}
	
	public static double multiply(double a, double b, double c)
	{
	double d = (a*b);
	return d;
	}
	
	public static double divide(double a, double b, double c)
	{
	double d = (a/b);
	return d;
	}
}