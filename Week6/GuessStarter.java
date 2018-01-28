import java.util.Random;
import java.util.*;

public class GuessStarter 
{

    public static void main(String[] args) 
    {
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        Scanner input = new Scanner(System.in);
	    int userInput  = input.nextInt();
        //System.out.println("Type a number: " + userInput);
        System.out.println("Your guess is: " + userInput);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        
        /*System.out.println("The number I was thinking of is: " + number);
        System.out.println("You were off by:" + (number - userInput));*/
        
        for(int i=0; (userInput != number); i++)
    	{
    		System.out.println("Wrong answer.");
    		
    		if(userInput > number)
    		{
    		System.out.println("Too high.");
    		System.out.println("");
    		}
    		else
    		{
    		System.out.println("Too low.");
    		System.out.println("");

    		}
    		
    	System.out.println("Enter another number.");
    	userInput = nextGuess();
    	}
    	System.out.println("Correct!");
    	

    }
    
    public static int nextGuess()
    {
    		Scanner input2 = new Scanner(System.in);
	    	int userInput2  = input2.nextInt();
	    	return userInput2;
    }
    
}