import java.util.Scanner;

public class UserInput
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Input an integer.");
		int choice = scan.nextInt();
		System.out.println("My int is:" + choice);
	}
}