import java.util.*;

public class Lab8Excercise1
{
	public static void main(String[] arg)
	{
	greaterThan();
	bikiniBottom();
	Happy();
	}
	public static void greaterThan()
	{
		int num = 0;
		int a = 0;		
		do
		{
			System.out.println("Enter a number.");
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();
			a = a + num;
		}
		while(a<=119);
	}
	public static void bikiniBottom()
	{
		
		String name = "";
	
		while(!name.equals("Bikini Bottom"))
		{
			System.out.println("Enter a name.");
			Scanner scan = new Scanner(System.in);
			name = scan.nextLine();
		}
		
	
	}
	public static void Happy()
	{
		String happiness = "";
		
		while(!happiness.equalsIgnoreCase("YES"))
		{
		System.out.println("Are you Happy?");
		Scanner scan = new Scanner(System.in);
		happiness = scan.nextLine();
		}
		
	}
}