public class MultiMethod
{
	public static void main(String[] args)
	{
	System.out.println("Starting program");
	methodFirst();
	System.out.println("Ending program");
	}
	public static void methodFirst()
	{
	System.out.println("starting method first");
	methodSecond();
	System.out.println("ending method first");
	}
	public static void methodSecond()
	{
	System.out.println("starting method second");
	System.out.println("ending method second");
	}
}