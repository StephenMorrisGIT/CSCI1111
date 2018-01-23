import java.util.*;

public class Operations
{
	public static void main(String[] args)
	{
	boolean positiveTest = isPositive();
	System.out.println(positiveTest);
	
	boolean fiftyTest = greaterThanFifty();
	System.out.println(fiftyTest);
	
	boolean evenTest = isEven();
	System.out.println(evenTest);
	
	}
	public static Boolean isPositive()
	{
	System.out.println("Enter your first number");
	Scanner input = new Scanner(System.in);
	int Test = input.nextInt();
	
		if(Test >= 0)
		{
		return true;
		}
		else
		{
		return false;
		}
	}
	
	public static Boolean greaterThanFifty()
	{
	System.out.println("Enter your second number");
	Scanner input = new Scanner(System.in);
	int Test = input.nextInt();
	
		if(Test > 50)
		{
		return true;
		}
		else
		{
		return false;
		}
	}
	
	public static Boolean isEven()
	{
	System.out.println("Enter your third number");
	Scanner input = new Scanner(System.in);
	int Test = input.nextInt();
	Test = Test % 2;
	
		if(Test == 0)
		{
		return true;
		}
		else
		{
		return false;
		}
	}
	

}